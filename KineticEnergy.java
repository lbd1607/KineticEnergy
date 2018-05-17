import javax.swing.JOptionPane;

/**
 * 
 * Laura Davis CIS 260 903
 * This program uses the formula for kinetic energy to calulate a number based on values
 * given by the user. For example, if the user has KE and mass, but needs velocity, then 
 * the program will send the user to a method that calculates it. Therefore, this program
 * can calculate any of the three factors of the KE equation.
 *
 */
public class KineticEnergy 
{
	public static void main(String[] args)
	{
		String input;
		
		input = JOptionPane.showInputDialog("Based on the formula for kinetic energy,"
				+ "which do yo need to calculate? \nk = kinetic energy, m = mass, v = velocity ");
		
		if (input.equalsIgnoreCase("k"))
		{
			calcKineticEnergy();
		}
		else if (input.equalsIgnoreCase("m"))
		{
			calcMass();
		}
		else if (input.equalsIgnoreCase("v"))
			calcVelocity(); 
		
	System.exit(0);	
	}//end of main
	
	/**
	 * Method calculates and displays kinetic energy
	 */
	public static void calcKineticEnergy()
	{
		String input;
		double ke, m, v;
		
		input = JOptionPane.showInputDialog("What is the mass of the object? ");
		m = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("What is the velocity of the object? ");
		v = Double.parseDouble(input);
		
		ke = 0.5 * m * Math.pow(v, 2);
		
		JOptionPane.showMessageDialog(null, "KE = " + ke + "\nm = " + m +
				"\nv = " + v);
		
	}//end of kineticEnergy
	
	/**
	 * method calculates and displays mass based on KE and velocity
	 */
	public static void calcMass()
	{
		String input;
		double m, v, ke;
		
		input = JOptionPane.showInputDialog("What is the kinetic energy of the object? ");
		ke = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("What is the velocity of the object? ");
		v = Double.parseDouble(input);
		
		m = ke / (0.5 * Math.pow(v, 2));
		
		JOptionPane.showMessageDialog(null, "The KE = " + ke + "\nThe m = " + m +
				"\nThe velocity = " + v);
		
	}//end of mass
	
	/**
	 * method calculates velocity based on KE and mass
	 */
	public static void calcVelocity()
	{
		String input;
		double v, v2, m, ke;
		
		input = JOptionPane.showInputDialog("What is the mass of the object? ");
		m = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("What is the kinetic energy of the object? ");
		ke = Double.parseDouble(input);
		
		v2 = ke / (0.5 * m);
		v = Math.sqrt(v2);
		
		JOptionPane.showMessageDialog(null, "The KE = " + ke + "\nThe m = " + m +
				"\nThe velocity = " + v);
		
	}//end of velocity
	
}//end of class

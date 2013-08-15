import javax.swing.JOptionPane;


public class TestSandwich {

	public static void main(String[] args) {
		/*
		 * This class is a program class.
		 * It WILL include a main() method.
		 * This program should create two instances of
		 * Sandwich, and it should demonstrate the
		 * use of all of the methods encapsulated
		 * in the Sandwich class.
		 * 
		 * Finish off this program by displaying the
		 * values of each of the fields for each 
		 * Sandwich instance.
		 * 
		 */
		
		Sandwich carolSandwich = new Sandwich();
		Sandwich joshSandwich = new Sandwich();

		
		//set the values of fields in sandwich
		carolSandwich.setMainIngred("Turkey");
		carolSandwich.setBreadType("white");
		carolSandwich.setPrice(5);
			
		
		//carols sandwiches
		String mainIngred =
				JOptionPane.showInputDialog(" what is the main ingredient?");
			carolSandwich.setMainIngred(mainIngred);
		
		String breadtype = JOptionPane.showInputDialog("what is the bread type?");
		carolSandwich.setBreadType(breadtype);
		
		String customer = JOptionPane.showInputDialog("how much is this sandwich?");
		
		int price = Integer.parseInt(JOptionPane.showInputDialog ("How much is this sandwich?"
				+ price + " ?"));
		
		
		//josh's sandwiches
		joshSandwich.setMainIngred("Turkey");
		joshSandwich.setBreadType("white");
		joshSandwich.setPrice(10);
			
		String mainIngred =
				JOptionPane.showInputDialog(" what is the main ingredient?");
		joshSandwich.setMainIngred(mainIngred);
		
		String breadType = JOptionPane.showInputDialog("what is the bread type?");
	joshSandwich.setBreadType(breadtype);
		
		String customer2 = JOptionPane.showInputDialog("how much is this sandwich?");
		
		int price = Integer.parseInt(JOptionPane.showInputDialog ("How much is this sandwich?"
				+ price + " ?"));

	}

}

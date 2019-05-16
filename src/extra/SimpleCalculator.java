package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
System.out.println(Double.MAX_VALUE);
		String coolked;
		String coolkeeneyesight;
		 coolked = JOptionPane.showInputDialog("numabha?");
		coolkeeneyesight=  JOptionPane.showInputDialog("nuuuuuumbor?");
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Are you going to ", "DSMA", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "subtract", "multiply", "add" },
				null);
		
		
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		if(operation==3) {	
			add(Double.parseDouble(coolked), Double.parseDouble(coolkeeneyesight));
		JOptionPane.showMessageDialog(null, "");
		}
		else if(operation==2) {
			multiply(Double.parseDouble(coolked), Double.parseDouble(coolkeeneyesight));
		
		}
		else if(operation==1) {
			subtract(Double.parseDouble(coolked), Double.parseDouble(coolkeeneyesight));
	
		}
		else if(operation==0) {
			divide(Double.parseDouble(coolked), Double.parseDouble(coolkeeneyesight));
	
		}
	
		
	
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
static void add(double numabha, double nuuuuuumbor) {
	JOptionPane.showMessageDialog(null, numabha + nuuuuuumbor);
	
}
static void multiply(double numabha, double nuuuuuumbor) {
	JOptionPane.showMessageDialog(null,numabha * nuuuuuumbor);
}
static void subtract(double numabha, double nuuuuuumbor) {
	JOptionPane.showMessageDialog(null,numabha - nuuuuuumbor);
}
static void divide(double numabha, double nuuuuuumbor) {
	JOptionPane.showMessageDialog(null,numabha / nuuuuuumbor);
}
}
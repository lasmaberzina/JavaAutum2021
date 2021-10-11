package sef.module3.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 8;
		int j = 5;
		
		// Subtract numbers
		int result = i-j;
		
		// Print result
		System.out.println("Difference = " + result);
		
		// Add numbers
		int add = i+j;

		
		// Print result
		System.out.println("add = " + add);

		//Multiply numbers
		int multiply = i*j;

		//Print result
		System.out.println("multiply = " + multiply);

		//Divide numbers
		int divide = i/j;

		//Print result
		System.out.println("divide = " + divide);

		//Module
		int module = i%j;

		//Print results
		System.out.println("module = " + module);
	}

}

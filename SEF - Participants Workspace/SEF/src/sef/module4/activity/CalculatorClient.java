package sef.module4.activity;

/**
 * @author
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
		 *final variable defined in Calculator class. 
		*/
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
		
		System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");
		
		// Add 
		int result = normalCalc.add(4, 5);
		System.out.println("1) Add result is " + result);
		
				
		// Multiply 
		result = normalCalc.multiply(5, 6);
		System.out.println("Multiply result is "  + result);


		//Divide
		result = normalCalc.divide(10, 2);
		System.out.println("Divide result is " + result);


		//Subtract
		result = normalCalc.subtract(10, 6);
		System.out.println("")

		

	}


	

}

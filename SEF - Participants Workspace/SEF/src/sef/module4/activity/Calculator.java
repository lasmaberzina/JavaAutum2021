/**
 * 
 */
package sef.module4.activity;

/**
 * @author 
 *
 */
public class Calculator<normalCalc, result> {

	
	private String calculatorType;
	public static final String CALC_TYPE_BASIC = "Basic";
	
	// Default constructor
	public Calculator() {}
	
	// Parameterized constructor
	public Calculator(String calculatorType) {
		this.calculatorType = calculatorType;
	}

	// Getter for CalculatorType
	public String getCalculatorType() {
		return calculatorType;
	}

	// Setter for CalculatorType
	public void setCalculatorType(String calculatorType) {
		this.calculatorType = calculatorType;
	}
	
	// Add 
	public int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	// Subtract
	 public int subtract (int x, int y) {
		 int diff = 0;
		 if (y > x) {
		 diff = x - y;
	 }else{
			 diff = y -x;

		 }
		return diff;

	}
	// Multiply
	public int multiply(int x, int y) {
		int mul = x * y;
		return mul;

	}

	// Divide
	public int divide (int x, int y) {
		int div = x / y;
		return div;

	}
	}

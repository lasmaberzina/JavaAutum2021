package sef.module8.sample;
// Needs to be completed
public class ExceptionDeclarationSample {

	public static void setAge(int age){		
		if(age < 0 ) {
			//1 - Throw an instance of  IllegalArgumentException with a String parameter
			//The parameter passed would be printed in the output
			System.out.println("Persons age is at least 0");
		}else{
			throw new IllegalArgumentException("Paramet age cannot be less than 0");
		}
	}
	
	public static void main(String arg[]){
		//2 - Call setAge with a negative parameter
		ExceptionDeclarationSample.setAge(1);
	}
}

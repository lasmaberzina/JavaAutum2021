package sef.module7.sample;

public class SetterGetterSample{

	public static void main(String arg[]){

		
		PersonSampleOne p1 = new PersonSampleOne();
		p1.name=null;
		p1.age=-1000;
		
		//Will not allow improper fields to be set by throwing an exception
		PersonSampleTwo p2 = new PersonSampleTwo("John Doe", -10);
		PersonSampleTwo p3 = new PersonSampleTwo("Sarah Johnson", 23,);

		System.out.println("--- Person Info ---");
		System.out.println("Age" + p2.getAge());
	}
}

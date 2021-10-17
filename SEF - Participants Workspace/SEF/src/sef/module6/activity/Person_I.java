package sef.module6.activity;

/* Person_I class is the superclass 
 * Attributes : name, age
 */
public class Person_I {

	//Attributes
	public class personI {

		public Object setSalary;
		//Attributes
		private String name;
		private int age;
		//Behavior - write default constructor. Print 'I'm Person_I constructor'

		public void Person_I() {
			this.name = "Sarah Johnson";
			this.age = 21;
			System.out.println("I'm Person_I constructor");
		}

		//Behavior - write parameterized constructor
		public void Person_I(String name, int age) {
			this.name = name;
			this.age = age;
		}

		// write getter for String name
		public String getName() {
			return name;
		}

		// write setter for String name
		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}}


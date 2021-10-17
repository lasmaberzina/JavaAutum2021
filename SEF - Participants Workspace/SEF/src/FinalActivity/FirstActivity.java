package FinalActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FirstActivity<lowest, num, highest, salary> {
    private static Object Employee;
    private static FinalActivity.Employee Person_a;
    private static FinalActivity.Employee Person_c;
    private static FinalActivity.Employee Person_d;

    public static void main(String[] args) {
        Person a = new Person();
        a.setName("Joshua Duo");
        a.setAge(21);
        a.setCompany("Seal");
        a.setJob("Tester");
        a.setSalary(4000);
        System.out.println("-----------------------");

        Person c = new Person();
        c.setName("John Peters");
        c.setAge(26);
        c.setCompany("Seal");
        c.setJob("Designer");
        c.setSalary(2500);
        System.out.println("-------------------------");

        Person d = new Person();
        d.setName("Anna Holmes");
        d.setAge(25);
        d.setCompany("Seal");
        d.setJob("Manager");
        d.setSalary(5000);
        System.out.println("--------------------------");

        System.out.println("Employee's name is " + a.getfName());
        System.out.println("Employee's name is " + a.getlName());
        System.out.println("Employee's age is " + a.getAge());
        System.out.println("Employee's salary is " + a.getSalary());
        System.out.println("Employee's company is" + a.getComapny());
        System.out.println("Employee's job is " + a.getJob());
        System.out.println("--------------------------");

        System.out.println("Employee's name is " + c.getfName());
        System.out.println("Employee's name is " + c.getlName());
        System.out.println("Employee's age is " + c.getAge());
        System.out.println("Employee's salary is " + c.getSalary());
        System.out.println("Employee's company is" + c.getComapny());
        System.out.println("Employee's job is " + c.getJob());
        System.out.println("--------------------------");

        System.out.println("Employee's name is " + d.getfName());
        System.out.println("Employee's name is " + d.getlName());
        System.out.println("Employee's age is " + d.getAge());
        System.out.println("Employee's salary is " + d.getSalary());
        System.out.println("Employee's company is" + d.getComapny());
        System.out.println("Employee's job is " + d.getJob());
        System.out.println("--------------------------");

        List<Employee> employees = new ArrayList<>(Employee)();
        employees.add(Person_a);
        employees.add(Person_c);
        employees.add(Person_d);

        System.out.println("before" + Arrays.toString(new List[]{employees}));
        

    }

    //ArrayList

    class Main {
        public static void main(String[] args) {

            ArrayList<String> salary = new ArrayList<>();

            salary.add("5000");
            salary.add("4000");
            salary.add("2500");
            System.out.println("ArrayList: " + salary);
        }
    }
}

package FinalActivity;

            public class Employee extends Person {
                Person person = new Person("", 20);
                private Object name;
                private Object age;
                private Object company;
                private Object jobTitle;
                private double salary;

                public Employee(String name, int age) {
                    super(name, age);
                }

                public void Employee() {
                System.out.println("I'm an Employee Constructor");

                    public void Introduce();
                        String template = "My name is <name> and I am <age> years old\n" +
                                "I work as <jobTitle> in <company>";
                        System.out.printf((template) + "%n", name, age, jobTitle, company);
                    }
                }
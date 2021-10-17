package FinalActivity;

                public class Person {
        private String name;
        private int age;
        private Object LasteName;


                    public Person(){
            this.name ="Unknown";
            this.age = 0;
            System.out.println("My name is <name> and i am <age> years old");
                  }

                    public Person(String name, int age) {
                        this.name = name;
                        this.age = age;
                    }


                    public String getName(){
                    return name;
                    }


           public void setName(String name){this.name = name;}
                    public int getAge(){return age;}
                    public void setAge(int age){this.age = age;}
                    public void setFirstName(String name){
                    }
                    public void setLastName(String name){this.LasteName = name;}
                    public void introduce(){
            System.out.println("My name is " + this.name + "and I am" + this.age + "years old");
             }

                    public void setSalary(int Salary) {
                    }

                    public void getfName() {
                    }

                    public void getlName() {
                    }

                    public void getSalary() {
                    }

                    public void setCompany(String accenture) {
                    }

                    public void setJob(String tester) {
                    }

                    public void getComapny() {
                    }

                    public void getJob() {
                    }
                }

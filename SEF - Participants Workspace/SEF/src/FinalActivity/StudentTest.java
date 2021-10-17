package FinalActivity;

                            import static org.junit.jupiter.api.Assertions.*;
class StudentTest {
    private int i;

    public static void main(String[] args) {
        StudentTest studentTest = new StudentTest();
        studentTest.validateUser("John");
        studentTest.validateUser("Anna");
        studentTest.validateUser("Joseph");
        studentTest.validateUser("Samantha");

    }

 void validateUser(String name) {
        String []validUsers={"John", "Anna", "Joseph", "Samantha"};
        int flag = 0;
        for(int i=0;i<4;i++);
     {
         if (validUsers[i].equals(name)) {
             flag = 1;
             break;
         }
     }
         StudentTest exception;
     }
        }
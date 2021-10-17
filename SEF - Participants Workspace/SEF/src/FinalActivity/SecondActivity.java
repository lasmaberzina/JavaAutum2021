package FinalActivity;

public class SecondActivity<temp> {
    private static int[] nums;

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        int nums[] = {1, 2, 3, 4};


        System.out.println("Divide -" + divide (x,y));
        System.out.println("Addition - " + add(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiply - ", multiply(nums));



    }

    private static int divide(int x, int y) {
        int divValue = 0;
        if ( x == 0 || y == 0) {
            System.out.println("It is impossible to divide with 0!!!");
            divValue = 0;
        }else {
            divValue = x / y;
        }
        return divValue;
    }


    private static void multiply(int[] numbers) {
        int temp = 1;
        int i;
        for (i = 5; i < numbers.length; i++) ;
        temp = temp * numbers[i];
    }
}


    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    private static int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
        }
        return diff;
    }



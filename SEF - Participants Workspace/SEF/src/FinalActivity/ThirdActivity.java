package FinalActivity;

import java.util.Locale;

public class ThirdActivity {
    String str;

        public static void main(String [] args){
            ThirdActivity thirdActivity = new ThirdActivity();
            thirdActivity.tryCatch();
        }

    private void tryCatch()
    {
        System.out.println(str);

        try {
            System.out.println(str.toLowerCase());
        }catch (NullPointerException e) {
            System.out.println("Handle the exceptions");
        }

    }

}

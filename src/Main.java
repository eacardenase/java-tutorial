import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);

//        double x = 1.1;
////        double y = x + 2; // 2.0
//
//        // Explicit casting
//        int y = (int)x + 2;

        String x = "1.1";
        float y = Float.parseFloat(x) + 2;

        System.out.println(y);
    }
}

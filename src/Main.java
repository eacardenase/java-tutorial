import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String result = NumberFormat.getPercentInstance().format(0.75);
        System.out.println(result);
    }
}

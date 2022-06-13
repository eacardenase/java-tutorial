import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature = 12;

        if (temperature > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temperature <= 30 && temperature >= 20) {
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's cold");
        }
    }
}

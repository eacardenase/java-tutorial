import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something. Write 'quit' to exit program.");
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("quit")) {
                System.out.println("Bye!");
                break;
            }
            System.out.println("Running...");
        }
    }
}

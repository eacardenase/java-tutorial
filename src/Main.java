import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        int[][] numbers = new int[3][3];

        int[][] numbers = { { 0, 0, 0}, {0, 0, 0} };

        numbers[0][0] = 1;

        System.out.println(Arrays.deepToString(numbers));
    }
}

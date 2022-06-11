import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        int[] myArray = new int[5];
//        myArray[0] = 1;
//        myArray[1] = 2;
//        myArray[2] = 3;
//        myArray[3] = 4;
//        myArray[4] = 5;

        int[] myArray = { 5, 2, 1, 4, 3 };
        Arrays.sort(myArray);

        System.out.println(Arrays.toString(myArray));
        System.out.println(myArray.length);
    }
}

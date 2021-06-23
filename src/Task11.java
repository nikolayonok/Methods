import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num ");
        int a = sc.nextInt();

        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt() ;
        }
        System.out.println(arraySum(array));
        System.out.println(Arrays.toString(array));
    }

    static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

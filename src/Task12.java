import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array ");
        int a = sc.nextInt();

        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(21) - 10;
        }
        System.out.println(arrayMax(array));
        System.out.println(Arrays.toString(array));
    }

    static int arrayMax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }
}

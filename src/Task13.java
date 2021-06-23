import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array ");
        int a = sc.nextInt();

        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(21) - 10;
        }
    }
}

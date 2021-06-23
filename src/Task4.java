import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter four num ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(printNum(a, b, c, d));
    }

    static int printNum(int... array) {
//        int[] array = {a, b, c, d};
        Arrays.sort(array);
        return array[array.length - 1];
    }
}

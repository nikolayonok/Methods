import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 num");
        int a = sc.nextInt();
        System.out.println("2 num");
        int b = sc.nextInt();
        printNum(a, b);
    }

    private static void printNum(int a, int b) {
        for (int i = (a < b ? a : b) + 1; i < (a < b ? b : a); i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}

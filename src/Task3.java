import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну ");
        int a = sc.nextInt();
        System.out.println("0 - горизонтальная, 1 - вертикальная ");
        int b = sc.nextInt();
        System.out.println("Введите символ ");
        String c = sc.next();
        printNum(a, b, c);
    }

    private static void printNum(int a, int b, String c) {
        for (int i = 0; i <= a; i++) {
            if (b == 0) {
                System.out.println(c);
            } else if (b == 1) {
                System.out.print(c);
            } else {
                System.out.println("EROR");
            }

        }
    }
}

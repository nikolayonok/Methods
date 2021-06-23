import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите диапазон ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(printNum(a, b));
    }

    static int printNum(int a, int b) {
        int c = 0;
        for (int i = (a < b ? a : b) + 1; i < (a < b ? b : a); i++){
            c += i;
        }
        return c;
    }
}

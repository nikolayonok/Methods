import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num ");
        int num = sc.nextInt();
        System.out.println(happyNum(num));
    }

    static boolean happyNum(int num) {
        boolean one;
        int num0 = num / 100000;
        int num1 = num / 10000 % 10;
        int num2 = num / 1000 % 10;
        int num3 = num / 100 % 10;
        int num4 = num / 10 % 10;
        int num5 = num % 10;
        if ((num0 + num1 + num2) == (num3 + num4 + num5)) {
            one = true;
        } else {
            one = false;
        }
        return one;
    }
}
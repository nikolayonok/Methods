import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num ");
        int a = sc.nextInt();
        System.out.println(isNatural(a));
    }

    static boolean isNatural(int a) {

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                 return false;
//                break;
            }
        }
        return true;
    }
}

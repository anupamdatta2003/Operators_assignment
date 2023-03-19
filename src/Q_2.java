import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = s.nextInt();
        System.out.println("Enter second number:");
        int y = s.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }
}

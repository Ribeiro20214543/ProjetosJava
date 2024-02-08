import java.util.Scanner;

/* Program that calculates the factorial of a user-supplied integer.
 */

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Factorial: ");
        int factorial = scanner.nextInt();

        int multiplication = 1;

        System.out.print(factorial + "! = ");
        for (int i = factorial; i >= 1; i--) {
            multiplication = multiplication * i;
        }

        System.out.println(multiplication);
    }
}

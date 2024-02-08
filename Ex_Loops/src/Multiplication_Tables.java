import java.util.Scanner;

/* Times tables generator, able to generate the multiplication table of any whole number
between 1 to 10. The user must inform which number he wants to see the multiplication table.
 */

public class Multiplication_Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Multiplication tables: ");
        int tables = scanner.nextInt();

        System.out.println("Multiplication tables of: " + tables);
        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(tables + " X " + i + " = " + (tables *i ));
        }
    }
}

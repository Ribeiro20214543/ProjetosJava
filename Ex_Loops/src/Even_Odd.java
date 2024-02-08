import java.util.Scanner;

/* Program that asks for X whole numbers,
calculates and shows the amount of even numbers
and the amount of odd numbers.
 */

public class Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amauntNumbers;
        int numbers;
        int amauntEven = 0, amauntOdd = 0;

        System.out.println("Number of numbers: ");
        amauntNumbers = scanner.nextInt();

        int count = 0;
        do {
            System.out.println("Number: ");
           numbers = scanner.nextInt();

            if (numbers % 2 == 0 ) amauntEven++;
            else amauntOdd++;

            count++;
        } while(count < amauntNumbers);

        System.out.println("Even quantity: " + amauntEven);
        System.out.println("Odd quantity: " + amauntOdd);
    }
}

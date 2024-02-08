import java.util.Scanner;


/* Program that reads 5 numbers and inform the largest number
and the average of these numbers.
 */

public class Largest_Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int bigger = 0;
        int sum = 0;

        int count = 0;
        do {
            System.out.println("Number: ");
            number = scanner.nextInt();

            sum = sum + number;

            if (number > bigger) bigger = number;

            count = count + 1;
        } while (count < 5);

        System.out.println("Bigger: " + bigger);
        System.out.println("Avarege: " + (sum / 5));
    }

}

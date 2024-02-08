/* Make a Program that reads 20 random integers (between 0 and 100) and store them in a vector.
At the end show the numbers and their successors.
 */

import java.util.Random;

public class RadomNumbers {
    public static void main (String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++) {
            int number = random.nextInt(100);
            randomNumbers[i] = number;
        }

        System.out.println("Random Numbers: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");

        }

        System.out.println("\nPredecessor of random numbers: ");
        for (int number : randomNumbers) {
            System.out.print((number - 1) + " ");
        }

        System.out.println("\nSuccessor of random numbers: ");
        for (int number : randomNumbers) {
            System.out.print((number + 1) + " ");
        }
    }
}

/* Make a Program that reads a 6-character vector,
and say how many consonants were read.
Print the consonants.
 */

import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consonants = new String [6];
        int quantityConsonants = 0;

        int count = 0;
        do{
            System.out.println("Letter: ");
            String letter = scanner.next();

            if (! (letter.equalsIgnoreCase("a")|
                    letter.equalsIgnoreCase("e")|
                    letter.equalsIgnoreCase("i")|
                    letter.equalsIgnoreCase("o")|
                    letter.equalsIgnoreCase("u"))){
                consonants[count] = letter;
                quantityConsonants++;
            }

            count++;
        } while(count < consonants.length);

        System.out.println("Consonants: ");
        for ( String consonant : consonants ) {
            if (consonant != null)
                System.out.println(consonant + " ");
        }
        System.out.println("Quantity of consonants: " + quantityConsonants);
        System.out.println(consonants.length);
    }
}

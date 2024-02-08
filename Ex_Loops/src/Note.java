import java.util.Scanner;


/* Program that asks for a grade, between zero and ten.
Display a message if the value is invalid
and keep asking until the user enters a valid value.
*/

public class Note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int note;

        System.out.println("Note: ");
        note = scanner.nextInt();

        while(note < 0 | note > 10) {
            System.out.println("Invalid grade!Type again: ");
            note = scanner.nextInt();
        }
    }
}

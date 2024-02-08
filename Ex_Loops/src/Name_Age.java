import java.util.Scanner;

/*
Program that reads sets of two values,
the first representing the username and the second representing their age.
(Stop the program by entering the value 0 in the name field)
*/

public class Name_Age {
    public static void main(String[]  args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        while (true) {
            System.out.println("Name: ");
            name = scanner.next();
            if (name.equals("o"))break;

            System.out.println("Age: ");
            age = scanner.nextInt();
        }

        System.out.println("Stay here...");
    }
}

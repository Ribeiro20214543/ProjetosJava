package Operadores_Aritmeticos;

import java.util.Scanner;

public class ArithmeticOperators {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one whole (Z) number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter other whole (Z) number: ");
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        int subtraction = number1 - number2;
        int division = number1 / number2;
        int multiplication= number1 * number2;
        int module = number1 % number2;
        System.out.println("Total sum = " + sum);
        System.out.println("Total subtraction = " + subtraction);
        System.out.println("Total division = " + division);
        System.out.println("Total multiplication = " + multiplication);
        System.out.println("Total module = " + module);
    }
}

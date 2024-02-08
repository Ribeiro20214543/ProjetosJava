package Oparador_de_Condicionais;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int number3 = sc.nextInt();
        System.out.println("Enter fourth number: ");
        int number4 = sc.nextInt();
        boolean x = ( number1 > number2) && (number3 < number4);
        boolean y = ( number1 > number2) || (number3 <  number4);
        boolean negation = (!true);
        System.out.println( number1 + " > " + number2 + " e " + number3 + " < " + number4 + " = " + x);
        System.out.println( number1 + " > " + number2 + " ou " + number3 + " < " + number4 + " = " + y);
        System.out.println( "negation = " + negation);
    }
}

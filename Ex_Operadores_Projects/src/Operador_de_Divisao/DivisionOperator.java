package Operador_de_Divisao;

import java.util.Scanner;

public class DivisionOperator {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        double result;
        double result1;
        result = number1 / number2;
        result1 = number1 % number2;
        System.out.println("Division = " + result);
        result = (double) number1 / (double)  number2;
        System.out.println("Division = " + result);
        System.out.println("Module = " + result1);
        result1 = (double) number1 / (double)  number2;
        System.out.println("Module = " + result1);

    }
}

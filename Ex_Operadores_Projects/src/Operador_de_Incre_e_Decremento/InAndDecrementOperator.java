package Operador_de_Incre_e_Decremento;

import java.util.Scanner;

public class InAndDecrementOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        b = a++; //incremento sufixo
        System.out.println("Increment operator is: " + a);
        System.out.println("Variable b is: " + b);
        a = b;
        b = a--; //decremento sufixo
        System.out.println("Decrement operator is: " + a);
        System.out.println("Variable b is: " + b);
        a = b;
        b = ++a; //incremento prefixo
        System.out.println("Decrement operator is: " + a);
        System.out.println("Variable b is: " + b);
        a =  b - 1;
        b = --a; //decremento prefixo
        System.out.println("Decrement operator is: " + a);
        System.out.println("Variable b is: " + b);
    }
}
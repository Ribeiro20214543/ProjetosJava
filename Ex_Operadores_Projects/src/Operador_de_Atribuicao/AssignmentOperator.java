package Operador_de_Atribuicao;

import java.util.Scanner;

public class AssignmentOperator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("Operator += is: " + (x += y));
        int b = x - y;
        System.out.println("Operator -= is: " + (b -= y));
        int c =  b + y;
        System.out.println("Operator *= is: " + (c *= y));
        int d = c / y;
        System.out.println("Operator /= is: " + (d /= y));
        int e = d * y;
        System.out.println("Operator %= is: " + (e %= y));
    }
}

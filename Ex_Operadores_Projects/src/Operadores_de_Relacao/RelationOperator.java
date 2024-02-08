package Operadores_de_Relacao;

import java.util.Scanner;

public class RelationOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        boolean equal = x == y;
        boolean diffferent = x != y;
        boolean less = x < y;
        boolean bigger = x > y;
        boolean greaterequal = x >= y;
        boolean lessequal = x <= y;
        System.out.println(x + " is equal than " + y + " = " + equal);
        System.out.println(x + " is different than " + y + " = " + diffferent);
        System.out.println(x + " is less than " + y +  " = " + less);
        System.out.println(x + " is bigger than " + y + " = " + bigger);
        System.out.println(x + " is greater and equal than " + y +  " = " + greaterequal);
        System.out.println(x + " is less and equal than " + y + " = " + lessequal);
    }
}

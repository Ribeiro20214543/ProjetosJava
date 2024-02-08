package Estrutura_Condicional;

import java.util.Scanner;

public class NestedConditionals {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = reader.nextInt();
        System.out.println("Enter second number: ");
        int second = reader.nextInt();
        System.out.println("Enter third number: ");
        int third = reader.nextInt();

        if(first > second && first > third) {
            System.out.println("Bigger number is = " + first);
        }else if(second > third) {
            System.out.println("Bigger number is = " + second);
        }else{
            System.out.println("Bigger number is = " + third);
        }
    }
}

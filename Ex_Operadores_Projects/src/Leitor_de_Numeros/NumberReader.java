package Leitor_de_Numeros;

import java.util.Scanner;

public class NumberReader {

    public static void main(String[] args) {
        int number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first whole (Z) numbers: ");
        number1 = sc.nextInt();
        System.out.println("Enter the second whole (Z) numbers: ");
        number2 = sc.nextInt();
        System.out.println("The numbers entered are: " + number1 + " and " + number2);
    }
}

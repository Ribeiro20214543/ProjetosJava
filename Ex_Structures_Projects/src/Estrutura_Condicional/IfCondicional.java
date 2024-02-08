package Estrutura_Condicional;

import java.util.Scanner;

public class IfCondicional {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos anos você tem? ");
        int years = sc.nextInt();
        if (years >= 18)
            System.out.println("Você é maior de idade.");
        else
            System.out.println("Você é menor de idade.");
    }
}

package Gerador_de_Saudacao;

import java.util.Scanner;

public class Greeting_Generator {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        String names, surnames;
        System.out.println("Enter yours name: ");
        names = reader.nextLine();
        System.out.println("Enter yours surnames: ");
        surnames = reader.nextLine();
        System.out.println("Hi, " + names + " " + surnames);
    }
}

package com.patrickfrr;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String names, surnames;
        System.out.println("Digite seu nome:");
        names = reader.nextLine();
        System.out.println("Digite seu sobrenome:");
        surnames = reader.nextLine();
        System.out.println("Bom dia " + names + " " + surnames);
    }
}

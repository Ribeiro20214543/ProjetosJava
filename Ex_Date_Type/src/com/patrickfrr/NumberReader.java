package com.patrickfrr;

import java.util.Scanner;

public class NumberReader {

    public static void main (String[] args) {
        int number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        number1 = sc.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        number2 = sc.nextInt();
        System.out.println("Os números digitados são: " + number1 + " e " + number2);
    }
}

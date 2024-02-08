package com.patrickfrr;

public class PrimitiveDataType {

    public static void main (String[] args) {
        byte b = 1; //byte é um inteiro de 8 bits ou 1 byte.
        short s = 12; //short é um inteiro de 2 byte.
        int i = 1234; //int é un inteiro de 4 byte.
        long l = 12345678; // long é un inteiro de 8 byte.

        System.out.println("O número: " + b  + " é um tipo de variável primitiva que armazena dados inteiros, pois estas possuem valor de -128 até 127.");
        System.out.println("O número: " + s  + " é um tipo de variável primitiva que armazena dados inteiros, pois estas possuem valor de -32,768 até 32,767.");
        System.out.println("O número: " + i  + " é um  um tipo de variável primitiva que armazena dados inteiros, pois estas possuem valor de -2,147,483,648 até 2,147,483,649.");
        System.out.println("O número: " + l  + " é  um tipo de variável primitiva que armazena dados inteiros, pois estas possuem valor de -9,223,372,036,854,775,808 até ,223,372,036,854,775,807.");


    }
}

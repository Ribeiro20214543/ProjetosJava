package com.patrickfrr;

public class ComparingFormats {
    public static void main(String[] args) {
/*
        int b = 0b1;
        int o = 01;
        int d = 1;
        int h = 0x1;
        System.out.println("Binário -> 0b1 = " + b);
        System.out.println("Octal -> 01 = " + o );
        System.out.println("Decimal -> 1 = " + d );
        System.out.println("Hexadecimal -> 0x1 = " + h );

        String b1 = "Não compila a partir daqui, pois o sistema binário só aceita os dígitos 0 e 1";
        int o1 = 03;
        int d1 = 3;
        int h1 = 0x3;
        System.out.println("Binário -> 0b3 = " + b1);
        System.out.println("Octal -> 03 = " + o1 );
        System.out.println("Decimal -> 3 = " + d1 );
        System.out.println("Hexadecimal -> 0x3 = " + h1 );

        String o2 = "Não compila a paritr daqui, pois o sistema octal só aceita os dígitos de 0 até 7";
        int d2 = 8;
        int h2 = 0x8;
        System.out.println("Octal -> 08 = " + o2 );
        System.out.println("Decimal -> 8 = " + d2 );
        System.out.println("Hexadecimal -> 0x8 = " + h2 );

        int d3 = 10;
        int h3 = 0x10;
        System.out.println("Decimal -> 10 = " + d3 );
        System.out.println("Hexadecimal -> 0x10 = " + h3 + " , que é o  limite máximo do sistema hexadecimal, após este  usamos  letras de A a F. ");

        int d4 = 10;
        int h4 = 0xA;
        System.out.println("Decimal -> 10 = " + d4 );
        System.out.println("Hexadecimal -> 0xA = " + h4);


        int d5 = 15;
        int h5 = 0xF;
        System.out.println("Decimal -> 15 = " + d5 );
        System.out.println("Hexadecimal -> 0xF = " + h5 + " , é o  limite máximo do sistema hexadecimal.");

 */

        int d6 = 16;
        String h6 = "Hexadecimal -> 0xG não compila";
        System.out.println("Decimal -> 16 = " + d6 );
        System.out.println( h6 + " , pois o  limite máximo do sistema hexadecimal é 15 representado pela letra F.");
    }
}

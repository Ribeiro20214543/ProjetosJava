package com.patrickfrr;

/* O sistema de numeração binário tem apenas 2 dígitos, 0 e 1.
Seu dígito mais baixo é 0 e o mais alto é 1.
Todos os binários em JAVA iniciam com 0b ou 0B. */

public class BinarioFormat {

    public static void main (String[] args) {

        int b = 0b110;
        System.out.println("0b110 = " + b);

        int B = 0B110;
        System.out.println("0B110 = " + B);
    }
}

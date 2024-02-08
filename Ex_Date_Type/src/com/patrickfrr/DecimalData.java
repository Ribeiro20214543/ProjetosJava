package com.patrickfrr;

/* float é um decimal de 4 bytes, determinado em JAVA colocando a letra f ao final.
double é um decimal de 8 bytes, podendo determinado-lo em JAVA colocando a letra d ao final, mas não é obrigatório.
 */

public class DecimalData {
    public static void main (String[] args) {
        float x = 54.7f;
        double y = 54.7;
        double y1 = 54.7d;
        System.out.println(x);
        System.out.println("sem d " + y);
        System.out.println("com d " + y1);

    }
}

package com.patrickfrr;

/* O sistema de numeração hexadecimal apresenta um problema uma vez que requer 16 dígitos— um mais baixo, o dígito 0,
e um mais alto, o dígito com um valor equivalente ao decimal 15 (um a menos que a base 16).
Por convenção, utilizamos as letras A a F para representar os dígitos hexadecimais correspondentes
aos valores decimais de 10 a 15. Portanto, em hexadecimal, podemos ter números como 876 consistindo unicamente
em dígitos do tipo decimal, números como 8A55F consistindo em dígitos e letras, e números como
FFE consistindo unicamente em letras.Todos os hexadecimais em JAVA iniciam com 0x ou 0X. */

public class HexadecimalFormat {
    public static void main (String[] args) {

        int h = 0x9;
        System.out.println("0x9 = " + h);

        int h1 = 0X99;
        System.out.println("0X99 = " + h1);

        int h2 = 0xF;
        System.out.println("0xF = " + h2);

        int h3 = 0xFF;
        System.out.println("0XFF = " + h3);

        int h4 = 0x9F;
        System.out.println("0X9F = " + h4);

        int h5 = 0xF9;
        System.out.println("0XF9 = " + h5);

        int h6 = 0x99FF;
        System.out.println("0X99FF = " + h6);

        int h7 = 0XFF99;
        System.out.println("0XFF99 = " + h7);


    }
}




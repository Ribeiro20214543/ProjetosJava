package com.patrickfrr;

/* char - é uma palavra reservada que permite armazenar caracteres.
Para defini-los se utiliza aspas simples (').
 */

public class ChracterType {

    public static void main (String[] args){
        char x = '9';
        char x1 = 'u';
        char x2 = 65; //Ao utilizar um tipo int em uma variável de tipo char,
        // o JAVA assume que o valor representa UNICODE e o traduz como um caratere,
        // neste caso, o retorno será 'A'.

        System.out.println(x);
        System.out.println(x1);
        System.out.println(x2);


    }
}

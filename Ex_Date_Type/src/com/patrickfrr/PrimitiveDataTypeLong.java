package com.patrickfrr;

public class PrimitiveDataTypeLong {

    public static void main (String[] args) {

        long l = 12345678910L; // Para compilar este variável é necessário acrescentar a letra L ao final dela.
        // Veja o comentário abaixo.

        System.out.println("O número: " + l  + " é  um tipo de variável primitiva que armazena dados inteiros, " +
                "pois estas possuem valor de -9,223,372,036,854,775,808 até ,223,372,036,854,775,807.");

    }
}


/*Esta variável não é possível compilar sem a letra L ao final,
pois o JAVA a entenderá como um tipo de dado int, logo se gera um erro de compilação - "java: integer number too large"
* Ao colocar-se ao final da variável a letra L em maiúscula, fará com que o JAVA entenda que se trata de uma variável do tipo long,
resolvendo o erro de compilação.*/
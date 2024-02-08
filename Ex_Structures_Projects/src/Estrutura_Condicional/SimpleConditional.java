package Estrutura_Condicional;

import java.util.Scanner;

public class SimpleConditional {

    public static void  main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas são as fases da lua? ");
        int lua = sc.nextInt();
        if (lua != 7) {
            System.out.println("Sua resposta não está correta! Tente outra vez!");
        }
    }
}

package com.patrickfrr;

import java.util.Random;

public class GenerateNumbers {

    public static void main(String[] args) {
        Random generate = new Random();

        //while (true) -> looping infinito
        // for (;;) -> looping infinito

        //while (1>10) -> looping com saída
        //for (int i = 0; i < 6; i++)

        int i = 0;
        while (i < 6) {

            int number = generate.nextInt(60);
            System.out.println(number);
            i++; // ou i = i + 1;
        }
    }
}

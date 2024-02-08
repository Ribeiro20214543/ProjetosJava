package Operadores_Nivel_Bits;

import java.util.Scanner;

public class BitsLevelOperator {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            int and = a & b;
            int or = a | b;
            int not = ~a;
            int xor = a^b;
            int height = a>>b;
            int left = a<<b;
            int enterzeroheight = a>>>b;
            System.out.println(a + " e " + b + " = " + and);
            System.out.println(a + " ou " + b + " = " + or);
            System.out.println(" not " + a + " = " + not);
            System.out.println(a + " between " + b + " = " + xor);
            System.out.println(a + " sprain height " + b + " = " + height);
            System.out.println(a + " sprain left " + b + " = " + left);
            System.out.println(a + " sprain height with zero " + b + " = " + enterzeroheight);
        }
}

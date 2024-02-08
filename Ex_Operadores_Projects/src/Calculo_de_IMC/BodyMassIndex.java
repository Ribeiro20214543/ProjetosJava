package Calculo_de_IMC;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main (String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Calculation of BMI");
        System.out.println("Enter your weight: ");
        double weight = reader.nextDouble();
        System.out.println("Enter your height: ");
        double height = reader.nextDouble();
        double index = weight/(height*height);
        System.out.println("For a weight of " + weight + " kilograms and");
        System.out.println("a height of " + height + " meters");
        System.out.println("the BMI is " + index);
    }
}


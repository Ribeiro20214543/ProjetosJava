package Converter_Graus_Celsius_em_Fahrenheit_e_Kelvin;

import java.util.Scanner;

public class ConvertCelsius {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double degreesCelsius, degreesFahrenheit, degreesKelvin;
        System.out.println("Enter degrees Celsius: ");
        degreesCelsius = sc.nextDouble();
        degreesFahrenheit = 32 + (9 * degreesCelsius / 5);
        degreesKelvin = degreesCelsius + 273;
        System.out.println(degreesCelsius + " °C = " + degreesFahrenheit + " °F.");
        System.out.println(degreesCelsius + " °C = " + degreesKelvin + " °K.");

    }
}

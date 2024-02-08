package Converter_Km_para_Metros;


import java.util.Scanner;

//Algoritmo de transformação de velocidade

public class Speed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed;
        System.out.println("Enter the speed in KM/h: ");
        speed = sc.nextDouble(); //dado decimal
        System.out.println(speed + " km/h -> " + speed * 1000/3600 + " m/s"); //expressao com operador * e /
    }
}

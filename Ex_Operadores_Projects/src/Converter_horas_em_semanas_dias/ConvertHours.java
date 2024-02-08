package Converter_horas_em_semanas_dias;

import java.util.Scanner;

public class ConvertHours {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int totalHours, weeks, days, hours;
        System.out.println("Enter the hours: ");
        totalHours = reader.nextInt();
        weeks = totalHours / (24 * 7);
        days = totalHours % (24 * 7) / 24;
        hours = totalHours % 24;
        System.out.println("The total of " + totalHours + " hours.");
        System.out.println("convert to:");
        System.out.println(weeks + " weeks;");
        System.out.println(days + " days;");
        System.out.println(hours + " hours.");
    }
}

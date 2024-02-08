package Estrutura_Condicional;

import java.util.Scanner;

public class ValorHoraExtra {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int horaExtra = 0, horaLimite = 40;
        double valorHora = 5, salario = 0;
        System.out.println("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        if (horasTrabalhadas > horaLimite) {
            horaExtra = horasTrabalhadas - horaLimite;
            salario = (horaExtra * valorHora);
            System.out.println("O salário extra a recerber é: " + salario);
        }else
            System.out.println("Não há horas extras a pagar.");
    }
}

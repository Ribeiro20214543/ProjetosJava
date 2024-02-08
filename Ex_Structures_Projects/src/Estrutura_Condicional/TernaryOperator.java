package Estrutura_Condicional;

public class TernaryOperator {
    public static void main (String[] args){
        int x = 8, y = 4, bigger;
        /*
        if(x>y)
        bigger = x;
        else
        bigger = y
        */
        bigger = (x > y) ? x:y;
        System.out.println("Bigger number is = " + bigger);
    }
}

package Estrutura_Condicional;

public class TargetContinue {
    public static void main(String []args){
        targetFor : for (int i = 1; i <= 12; i++){
            for(int j = 1; j <+ 12; j++){
                if(i==2|| i==3){
                    continue targetFor;
                }
                System.out.println(i+ " * " + j + " = " + (i * j));
            }
        }
        System.out.println("We left the cycle...");
    }
}


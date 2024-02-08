package Estrutura_Condicional;

public class Break {
    public static void main(String []args){
        for(int i = 1; i<= 7; i++){
            if(i==4){
                System.out.println("Day "+i+ ": Rest");
                break;
            }
            System.out.println("Day "+i+ ": Working");
        }
    }
}

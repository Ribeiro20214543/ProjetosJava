package Estrutura_Condicional;

public class Continue {
    public static void main(String[]args){
        for(int i = 1; i<= 7; i++){
            if(i==2 || i==3){;
                continue;
            }
            System.out.println("Day "+i+ ": Working");
        }
    }
}


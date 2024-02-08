package Estrutura_Condicional;

public class StructresSwitch {
    public static void main (String[] args){
        int option = 3; //Enter day number
        String day = "";
        switch (option){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            default:
                day = "It's not a working day.";
        }
        System.out.println(day);
    }
}

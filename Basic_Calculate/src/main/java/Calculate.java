public class Calculate {

    public static void main(String[] args) {
        int x = Integer.parseInt((args[1]));
        int y = Integer.parseInt((args[2]));

        // if e else são condicionais de true ou false
        // if = saída true
        // else = saida false

       if (args[0].equals("somar")) {
           sum(x, y);
       } else if (args[0].equals("subtrair")) {
           subtract(x, y);
       } else if (args[0].equals("multiplicar")) {
           multiples(x, y);
       } else if (args[0].equals("dividir")) {
           share(x, y);
       } else {
           System.out.println("Nenhuma instrução definida.");
       }
    }

    static void sum (int x, int y){
        System.out.println(x + y);
    }
    static void subtract (int x, int y){
        System.out.println(x - y);
    }
    static void multiples (int x, int y){
        System.out.println(x * y);
    }
    static void  share (int x, int y){
        System.out.println(x / y);
    }
}

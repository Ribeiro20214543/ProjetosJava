package Method_Potency_Division;

public class Executor {
    public static void main(String[] args) {
        Mathematics m = new Mathematics();
        double s = m.sum(78, 65.89);
        int p = m.potency(2, 5);
        System.out.println("The sum is: " + s);
        System.out.println("The potency is: " + p);
        m.division(32, 5);


    }
}

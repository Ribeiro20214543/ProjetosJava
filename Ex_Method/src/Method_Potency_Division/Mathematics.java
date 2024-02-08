package Method_Potency_Division;

//Define a class with three methods: sum, potency, division, each with a parameter.

public class Mathematics {

    public double sum (double a, double b) {
        return a + b;
    }

    public int potency(int base, int exponent) {
        int result = 1;
        for (int i = 1; i < exponent; i++) {
            result +=base;
        }
        return result;
    }

    public void division (int dividend, int divider) {
        int counter = 0;
        while (dividend >= divider){
            dividend -= divider;
            counter++;
        }
        System.out.println("Quotient is: " + counter);
        System.out.println("Rest is: " + dividend);
    }
}

package Method_Factorial_Fibonnacci;

//Create a class that contains two methods to calculate the factorial and Fibonacci of a given number.

public class Algorithms {

    public int factorial(int n){
        int factorial = 1;
        for (int i = 2; i < n; i++){
            factorial *=i;
        }
        return factorial;
    }

    public int fibonacci (int n){
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++){
            c = a + b;
            b = a;
            a = c;
        }
        return a;
    }
}


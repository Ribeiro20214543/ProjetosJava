/* Create a vector of 6 integers
and show them in reverse order.
 */

public class ReverseOrder {
    public static void main(String[] args){

        int [] vector = {-4, -8, 16, 32, 8, 4};

        System.out.println("Vector: ");
        int count = 0;
        while (count < (vector.length)) {
            System.out.println(vector[count] + " ");
            count++;
        }
        System.out.println("\nVector: ");
        for(int i = (vector.length - 1); i >= 0; i --) {
            System.out.println(vector[i] + " ");
        }
    }
}

import java.util.Random;

/*Generate and print a 4x4 matrix M with random values between 0-9.
 */
public class Multidimensional {
    public static void main (String[] args) {
        Random random = new Random ();

        int [][]Multi = new int [4][4];

        for (int i = 0; i < Multi.length; i++) {
           for (int j = 0; j < Multi[i].length; j++){
            Multi[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matrix: ");
        for(int[] line : Multi) {
            for (int column : line) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}

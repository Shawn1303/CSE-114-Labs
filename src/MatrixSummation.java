import java.util.Arrays;
import java.util.Scanner;

public class MatrixSummation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of an nxm matrix in the form n m: ");
        int n = input.nextInt();
        int m = input.nextInt();
        double[][] matrix = new double[n][m];
        input.nextLine();
        System.out.println("Enter the matrix of " + n + " " + m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = input.nextInt();
            }
            input.nextLine();
        }
        double[] sums = sumColumn(matrix);
        System.out.println("Sums of columns are: ");
        System.out.println(Arrays.toString(sums));
        input.close();
    }
    public static double[] sumColumn(double [][] matrix) {
        double[] sums = new double[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (double[] doubles : matrix) {
                sum += doubles[j];
            }
            sums[j] = sum;
        }
        return sums;
    }
}

import java.util.Scanner;

public class MultiplyMatrices {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 6 rows of 3 values to create two 3x3 matrices: ");
		double[][] m = new double[3][3], n = new double[3][3];
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				m[i][j] = input.nextInt();
			}
			input.nextLine();
		}
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[0].length; j++) {
				n[i][j] = input.nextInt();
			}
			input.nextLine();
		}
		double[][] s = multiplyMatrix(m,n);
		for(double[] row: s) {
			for(double col: row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		input.close();
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][b[0].length];
		if (a[0].length == b.length) {
			for (int k = 0; k < b[0].length; k++) {
				for (int i = 0; i < a[0].length; i++) {
					int sum = 0;
					for (int j = 0; j < b.length; j++) {
						sum += a[i][j] * b[j][i];
					}
					c[k][i] = sum;
				}
				
			}
		}
		return c;
	}

}

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("\t");
			}
			int pow = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(pow + "\t");
				pow *= 2;
			}
			pow /= 4;
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(pow + "\t");
				pow /= 2;
			}
			System.out.println();
		}
		input.close();
	}

}

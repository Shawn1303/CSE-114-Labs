import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[0];
		int number = 0, count;
		System.out.println("Enter 10 numbers with spaces: ");
		for (int i = 0; i < 10; i++) {
			number = input.nextInt();
			count = 0;
			for (int j = 0; j < num.length; j++) {
				if (number == num[j]) {
					count++;
				}
			}
			if (count == 0) {
				int[] temp = num;
				num = new int[temp.length + 1];
				System.arraycopy(temp, 0, num, 0, temp.length);
				num[num.length - 1] = number;
			}
		}
		for (int item : num) {
			System.out.println(item);
		}
		input.close();
	}

}

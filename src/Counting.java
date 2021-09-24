import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		System.out.println("Enter a positive or negative number. Enter 0 to terminate code: ");
		int total = 0, pos = 0, neg = 0;
		while (true) {
			int num = numbers.nextInt();
			if (num == 0) {
				break;
			}
			if (num > 0) {
				pos++;
			} else {
				neg++;
			}
			total += num;
		}
		System.out.println("There are " + pos + " positives and " + neg + " negatives with the total sum of " + total + " and an average of " + (total/(1.0 * pos + neg)));
		numbers.close();
	}
}

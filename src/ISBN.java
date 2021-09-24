import java.util.Scanner;
public class ISBN {
	public static void main(String[] args) {
		int sum = 0;
		Scanner digit = new Scanner(System.in);
		System.out.println("Enter 9 digits to display the 10-digit ISBN: ");
		String digits = digit.next();
		for (int i = 0; i < 9;) {
			sum += (Character.getNumericValue(digits.charAt(i)) * ++i);
		}
		int d10 = sum % 11;
		if (d10 == 10) {
			System.out.println(digits + "X");
		} else {
			System.out.println(digits + d10);
		}
		digit.close();
	}
}

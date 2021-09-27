import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String f = input.nextLine();
		System.out.println("Enter the second string: ");
		String s = input.nextLine();
		int sum = 0;

		for (int i = 0; i < ((s.length() > f.length()) ? f.length() : s.length()); i++) {
			if (!(s.charAt(i) == f.charAt(i))) {
				break;
			} else {
				sum = i;
			}
		}
		if (sum == 0) {
			System.out.println(s + " and " + f + " have no common prefix.");
		} else {
			System.out.println(s.substring(0, sum));
		}
	}

}

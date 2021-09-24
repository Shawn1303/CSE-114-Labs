import java.util.Scanner;

public class ReversedString {
	public static void main(String[] args) {
		Scanner string = new Scanner(System.in);
		System.out.println("Enter the words you want to reverse the spelling of: ");
		String words = string.nextLine();
		String reverse = "";
		for (int i = words.length() - 1; i > -1; i--) {
			reverse += words.charAt(i);
		}
		string.close();
		System.out.println("Reversed words are: " + reverse);
	}
}

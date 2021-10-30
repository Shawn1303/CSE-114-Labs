import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a palindrome: ");
		String string = input.next();
		
		int backIndex = string.length() - 1;
		boolean isPalin = true;
		
		for(int i = 0; i < string.length() / 2; i++) {
			if(string.charAt(i) != string.charAt(backIndex)) {
				isPalin = false;
				break;
			}
			backIndex--;
		}
		if(isPalin) System.out.println("string is palindrome");
		else System.out.println("string is not a palidrome");
	}

}

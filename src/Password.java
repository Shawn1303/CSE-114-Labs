import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String string = input.next();
		
		if(string.length() < 8) {
			System.out.println("invalid password");
		} else {
			boolean lower = false;
			boolean upper = true;
			boolean special = false;
			boolean number = false;
			
			for(int i = 0; i < string.length(); i++) {
				String s = string.substring(i, i+1);
				if(s.matches("[a-z]{1}")) lower = true;
				else if (s.matches("[A-Z]{1}")) upper = true;
				else if (s.matches("[\\d]{1}")) number = true;
				else if (s.matches("[!@#$%^&*]{1}")) special = true;
			}
			
			if(lower && upper && special && number) System.out.println("valid password");
			else System.out.println("invalid password");
		}
	}

}

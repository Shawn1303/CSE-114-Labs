import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a email: ");
		String string = input.next();
		
		if(string.matches("(.)+@(.)+")) System.out.println("Valid email");
		else System.out.println("Invalid email");
		input.close();
	}

}

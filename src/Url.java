import java.util.Scanner;

public class Url {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a url: ");
		String string = input.next();
		
		if(string.matches("http[s]{0, 1}://www.(.){2,}\\.(.){2.3}")) System.out.println("Valid");
		else System.out.println("invalid");
	}

}

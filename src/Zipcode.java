import java.util.Scanner;

public class Zipcode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a zipcode: ");
		String string = input.next();
		
		if(string.matches("[0-9]{5}")) System.out.println("valid zipcode");
		else System.out.println("invalid zipcode");
		input.close();
	}

}

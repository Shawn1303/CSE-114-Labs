import java.util.Scanner;

public class Gasoline {
	public static void main(String[] args) {
		double minutes, mph, mpg, galConsumed;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		minutes = input.nextDouble();
		System.out.println("Enter the constant speed of the car (m/h): ");
		mph = input.nextDouble();
		System.out.println("Enter the fuel efficiency of the car (m/g): ");
		mpg = input.nextDouble();
		galConsumed = minutes/60*mph/mpg;
		System.out.println("Consumed gas for the period (in gallons): " + galConsumed);
	}
}

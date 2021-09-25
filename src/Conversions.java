import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("A - convert pounds to kilos\r\n" + "B - convert kilos to pounds\r\n"
				+ "C - convert kilometers to miles\r\n" + "D - convert miles to kilometers\r\n"
				+ "E - convert Celsius to Fahrenheit\r\n" + "F - convert Fahrenheit to Celsius\r\n" + "E - Exit\r\n"
				+ "Enter your option: ");
		char ans = input.nextLine().charAt(0); 
		String unit = "", output = "";
		double amount = 0; 
		System.out.println(ans == 'A');
		if (ans == 'A') {
			System.out.println("Enter a quantity in pounds: ");
			unit = "pounds";
			amount = input.nextDouble();
			output = poundsToKilos(amount) + " kilos";
			System.out.println(amount + " " + unit + " is " + output);
		}
		if (ans == 'B') {
			System.out.println("Enter a quantity in kilos: ");
			unit = "kilos";
			amount = input.nextDouble();
			output = kilosToPounds(amount) + " pounds";
			System.out.println(amount + " " + unit + " is " + output);
		}
		if (ans == 'C') {
			System.out.println("Enter a quantity in km: ");
			unit = "km";
			amount = input.nextDouble();
			output = kmToM(amount) + " m";
			System.out.println(amount + " " + unit + " is " + output);
		}
		if (ans == 'D') {
			System.out.println("Enter a quantity in miles: ");
			unit = "m";
			amount = input.nextDouble();
			output = mToKm(amount) + " km";
			System.out.println(amount + " " + unit + " is " + output);
		}
		if (ans == 'E') {
			System.out.println("Enter a quantity in celsius: ");
			unit = "celsius";
			amount = input.nextDouble();
			output = celsiusToFarenheit(amount) + " fahrenheit";
			System.out.println(amount + " " + unit + " is " + output);
		}
		if (ans == 'F') {
			System.out.println("Enter a quantity in fahrenheit: ");
			unit = "fahrenheit";
			amount = input.nextDouble();
			output = farenheitToCelsius(amount) + " calsius";
			System.out.println(amount + " " + unit + " is " + output);
		}
		input.close();
	}

	public static double poundsToKilos(double pounds) {
		return pounds*0.453592;
	}

	public static double kilosToPounds(double kilos) {
		return kilos*2.20462;
	}

	public static double kmToM(double km) {
		return km/0.621371;
	}

	public static double mToKm(double m) {
		return m*1.60934;

	}

	public static double celsiusToFarenheit(double celsius) {
		return celsius*(9.0/5) + 32;
	}

	public static double farenheitToCelsius(double fahrenheit) {
		return (fahrenheit-32) * (5.0/9);
	}
}

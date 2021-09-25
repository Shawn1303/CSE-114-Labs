// Shawn Zhu, 114590303

import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		System.out.println("Enter a temperature between -58 Fahrenheit and 41 Fahrenheit and a wind speed greater than or equal to 2 with a space in between: ");
		int t_a = temp.nextInt();
		int v = temp.nextInt();
		System.out.println("The wind-chill temperature is: " + (35.74+0.6215*t_a-35.57*Math.pow(v,  0.16)+0.4275*t_a*Math.pow(v, 0.16)));
		temp.close();
	}

}

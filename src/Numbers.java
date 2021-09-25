// Shawn Zhu, 114590303

import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enetr an interger: ");
		int interger = input.nextInt();
		boolean divisible = false;
		if (interger % 5 == 0 && interger % 6 == 0) {
			divisible = true;
		} else {
			divisible = false;
		}
		System.out.println("Is 10 divisible by 5 and 6? " + divisible);
		if (interger % 5 == 0 || interger % 6 == 0) {
			divisible = true; 
		} else {
			divisible = false;
		}
		System.out.println("Is 10 divisible by 5 or 6? " + divisible);
		if (interger % 5 == 0 ^ interger % 6 == 0) {
			divisible = true;
		} else {
			divisible = false;
		}
		System.out.println("Is 10 divisible by 5 or 6, but not both? " + divisible);
		input.close();
	}

}

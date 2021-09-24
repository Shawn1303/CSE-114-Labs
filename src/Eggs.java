// Shawn Zhu, 114590303

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The number of eggs in the order (integer): ");
		int eggs = input.nextInt();
		System.out.printf("You ordered %d eggs. That’s %d dozen at $3.25 per dozen and %d loose eggs at 45 cents for a total of $%.2f.", eggs, eggs/12, eggs % 12, (eggs-eggs%12)/12*3.25+eggs%12*0.45);
		input.close();
	}

}

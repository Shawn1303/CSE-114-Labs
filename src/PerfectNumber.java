import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the uopper limit: ");
		int u = input.nextInt();
		ArrayList<Integer> perfectNumber = new ArrayList<Integer> (Arrays.asList(6, 28, 496, 8128, 33550336));
		for(int i = 0; i < perfectNumber.size(); i++) {
			if (perfectNumber.get(i) > u) {
				perfectNumber.remove(i);
			}
		}
		System.out.print("The perfect numbers below " + u + " are: ");
		for(int i: perfectNumber) {
			System.out.print(i + " ");
		}
		input.close();
	}

}

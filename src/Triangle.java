// Shawn Zhu, 114590303

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Side1: ");
		int s1 = input.nextInt();
		System.out.println("Side2: ");
		int s2 = input.nextInt();
		System.out.println("Side3: ");
		int s3 = input.nextInt();
		if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
			if (s1 == s2 && s1 == s3) {
				System.out.println("Output: Equilateral");
			} else if (s1 == s2 ^ s1 == s3) {
				System.out.println("Output: Isosceles");
			} else {
				System.out.println("Output: Scalene");
			}
		} else {
			System.out.println("Output: Invalid input!");
		}
	}

}

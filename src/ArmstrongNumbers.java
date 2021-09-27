import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Eneter the lower limit: ");
		int l = input.nextInt();
		System.out.println("Eneter the upper limit: ");
		int u = input.nextInt();
		System.out.println("The Armstrong number between " + l + " and " + u + " are: ");
		for(int i = l; i <= u; i++) {
			if (isArmstrong(i)) {
				System.out.println(i + " ");
			}
		}

	}
	public static boolean isArmstrong(int n) {
		int oldN = n;
		String s = "" + n;
		int length = s.length();
		int sum = 0;
		while(n > 0) {
			sum += (int)(Math.pow(n%10, length));
			n /= 10;
		}
		return sum == oldN;
	}

}

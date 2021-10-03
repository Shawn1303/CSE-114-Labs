import java.util.Scanner;

public class Interests {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Loan amount: ");
		int loanAmount = input.nextInt();
		System.out.println("Number of years: ");
		int numberOfYears = input.nextInt();
		double annualInterestRate = 0.05;
		double monthlyInterestRate = annualInterestRate / 12.00;
		double monthlyPayment = (int) ((loanAmount * monthlyInterestRate
				/ (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)))) * 100) / 100.0;
		double totalPayment = (int) ((monthlyPayment * numberOfYears * 12) * 100) / 100.0;
		for (int i = 0; i < 25; i++) {
			System.out.println(annualInterestRate * 100 + "% \t" + monthlyPayment + "\t" + totalPayment);
			annualInterestRate = (int) ((annualInterestRate + 0.00125) * 1000000) / 1000000.0;
			monthlyInterestRate = annualInterestRate / 12.00;
			monthlyPayment = (int) ((loanAmount * monthlyInterestRate
					/ (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)))) * 100) / 100.0;
			totalPayment = (int) ((monthlyPayment * numberOfYears * 12) * 100) / 100.0;
		}
		input.close();
	}

}

import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of a complex number, separated by a space.");
        double r1 = in.nextDouble();
        double i1 = in.nextDouble();
        Complex n1 = new Complex(r1, i1);
        in.nextLine();
        System.out.println("Repeat for a second number. ");
        double r2 = in.nextDouble();
        double i2 = in.nextDouble();
        Complex n2 = new Complex(r2, i2);
        System.out.println("Sum: " + Complex.add(n1, n2).toString());
        System.out.println("Difference: " + Complex.subtract(n1,n2).toString());
        System.out.println("Product: " + Complex.multiply(n1,n2).toString());
        System.out.println("Quotient: " + Complex.divide(n1,n2).toString());
    }
}

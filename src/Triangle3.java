public class Triangle3 {
    private double side1, side2, side3;

    public Triangle3(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2)
            throw new IllegalTriangleException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public static void main(String[] args) {
        try {
            new Triangle3(3, 4, 5);
            System.out.println("Valid Triangle - (3, 4, 5)");
        } catch (IllegalTriangleException e) {
            System.out.println("Not valid Triangle - (3, 4, 5)");
        }
    }

    class IllegalTriangleException extends Throwable {

    }
}

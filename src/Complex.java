public class Complex extends Number implements Comparable, Cloneable{
    private double r;
    private double i;

    public Complex() {};
    public Complex(double real) {
        r = real;
    }

    public Complex(double real, double imaginary) {
        r = real;
        i = imaginary;
    }

    public double getRealPart() {return r;}
    public double getImaginaryPart() {return i;}
    public void add(Complex number) {
        r += number.r;
        i += number.i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.r+b.r, a.i+b.i);
    }

    public void subtract(Complex number) {
        r -= number.r;
        i -= number.i;
    }

    public static Complex subtract(Complex a, Complex b) {
        return new Complex(a.r-b.r, a.i-b.i);
    }

    public void multiply(Complex number) {
        r = r*number.r-i*number.i;
        i = i*number.r+r*number.i;
    }

    public static Complex multiply(Complex a, Complex b) {
        double r = a.r;
        double i = a.i;
        double r2 = r*b.r-i*b.i;
        double i2 = i*b.r+r*b.i;
        return new Complex(r2, i2);
    }

    public void divide(Complex number) {
        r = (r*number.r+i*number.i)/(Math.pow(number.r,2)) + Math.pow(number.i,2);
        i = (i*number.r-r*number.i)/(Math.pow(number.r,2)) + Math.pow(number.i,2);
    }
    public static Complex divide(Complex a, Complex b) {
        double r = a.r;
        double i = a.i;
        double r2 = (r*b.r+i*b.i)/((Math.pow(b.r,2)) + Math.pow(b.i,2));
        double i2 = (r*b.r-i*b.i)/((Math.pow(b.r,2)) + Math.pow(b.i,2));
        return new Complex(r2, i2);
    }

    public String toString() {
        if(i != 0) return "Complex number: " + r + " + " + i + "i";
        else return "Complex number: " + r;
    }

    public double doubleValue() {return r;}
    public float floatValue() {return (float) r;}
    public int intValue() {return (int) r;}
    public long longValue() {return (long) r;}

    public Object clone() throws CloneNotSupportedException{
        Complex n = (Complex) super.clone();
        return n;
    }

    public int compareTo(Object o) {
        Complex number = (Complex) o;
        if(r < number.r) return 1;
        if(r < number.r) return -1;
        return 0;
    }
}

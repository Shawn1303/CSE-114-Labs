import java.util.Scanner;
public class TriangleArea {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[][] points = new double[3][2];
		points[0][0] = in.nextDouble();
		points[0][1] = in.nextDouble();
		points[1][0] = in.nextDouble();
		points[1][1] = in.nextDouble();
		points[2][0] = in.nextDouble();
		points[2][1] = in.nextDouble();
		double area = getTriangleArea(points);
		if (Double.isNaN(area) || area == 0) {
			System.out.println("The points area on the same line.");
		} else {
			System.out.println("The area of the triangle is " + area);
		}
		in.close();
	}
	    public static double getTriangleArea(double[][] points){
	        double a = pythagorean(points[0], points[1]);
	        double b = pythagorean(points[1], points[2]);
	        double c = pythagorean(points[2], points[0]);
	        double term1 = 4*Math.pow(a,2)*Math.pow(b,2);
	        double term2 = Math.pow(Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2),2);

	        return 0.25* Math.sqrt(term1-term2);
	    }
	public static double pythagorean(double[] pt1, double[] pt2){
	        return Math.sqrt(Math.pow(pt2[0]-pt1[0],2)+Math.pow(pt2[1]-pt1[1],2));
	}
}

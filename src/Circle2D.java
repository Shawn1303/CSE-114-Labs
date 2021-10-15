
public class Circle2D {
	private double x;
	private double y;
	private double r;
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getR() {
		return this.r;
	}
	
	public Circle2D() {
		this.x = 0;
		this.y = 0;
		this.r = 1;
	}
	
	public Circle2D(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(r, 2);
	}
	
	public double getPerimeter() {
		return Math.PI * 2 * r;
	}
	
	public boolean contains(double x, double y) {
		boolean xValid = x <= this.x + this.r && x >= this.x - this.r;
		boolean yValid = y <= this.y + this.r && y >= this.x - this.r;
		return xValid && yValid;
	}
	
	public boolean contains(Circle2D circle) {
		boolean xValid = circle.getX() + circle.getR() <= this.x + this.r && circle.getX() - circle.getR() <= this.x + this.r;
		boolean yValid = circle.getY() + circle.getR() <= this.y + this.r && circle.getY() - circle.getR() <= this.y + this.r;
		return xValid && yValid;	
	}
	
	public boolean overLap(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(circle.getX() + this.getX(), 2) + Math.pow(circle.getY() + this.getY(), 2));
		return circle.getR() + this.getR() <= distance;
	}
}

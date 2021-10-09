
public class Rectangle {

		private double width = 1;
		private double height = 1;
		private String color = "white";
		
		public Rectangle() {
			
		}
		
		public Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}
		
		public double getWidth() {
			return width;
		}
		
		public double getHeight() {
			return height;
		}
		
		public String getColor() {
			return color;
		}
		
		public void setWidth(double width) {
			this.width = width;
		}
		
		public void setHeight(double height) {
			this.height = height;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public double getArea() {
			return width * height;
		}
		
		public double getPerimeter() {
			return 2*width + 2*height;
		}
		
		public String toString() {
			return "width=" + getWidth() + ", height=" + getHeight() + ", color=" + getColor(); 
		}
		
		public static void main(String[] args) {
			Rectangle rect1 = new Rectangle(4, 40);
			Rectangle rect2 = new Rectangle(3.5, 35.9);
			
			rect1.setColor("red");
			rect2.setColor("red");
			
			System.out.println(rect1);
			System.out.println(rect2);
			
			System.out.println("area of rect1 = " + rect1.getArea() + " perimeter of rect1 = " + rect1.getPerimeter());
			System.out.println("area of rect1 = " + rect2.getArea() + " perimeter of rect1 = " + rect2.getPerimeter());
		}
	}



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
	}


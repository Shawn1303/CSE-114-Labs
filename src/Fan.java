public class Fan {
	final int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int speed = SLOW;
	private boolean fanIsOn = false;
	private double radius = 5;
	private String color = "blue";
	
	public Fan() {
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean getFanIsOn() {
		return fanIsOn;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setFanIsOn(boolean fanIsOn) {
		this.fanIsOn = fanIsOn;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		if (fanIsOn) {
			return "Fan is on at speed " + speed + ", color " + color + " and radius " + radius;
		} else {
			return "Fan is not on with color " + color + " and radius " + radius;
		}
	}
}

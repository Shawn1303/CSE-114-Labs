import java.util.Scanner;
public class Celsius2Fahrenheit {
	public static void main(String[] args) {
		double celsius, fahrenheit;
		System.out.println("Enter a degree in Celsius: ");
	    Scanner celInput = new Scanner(System.in);  
	    celsius = celInput.nextDouble(); 
	    fahrenheit = (9.0/5)*celsius + 32;
	    System.out.println(celsius + " in Celsius is " + fahrenheit + " in Fahrenheit");  
	  }
}

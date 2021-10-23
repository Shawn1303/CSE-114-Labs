
public class testStock {

	public static void main(String[] args) {
		Stock stock1 = new Stock("GOOG", "Google Inc.");
		stock1.setPreviousClosingPrice(100);
		stock1.setCurrentPrice(90);
		System.out.println("The percentage change is " + stock1.changePercent());
		
		Stock stock2 = new Stock("FB", "Facebook Inc.");
		stock1.setPreviousClosingPrice(345.96);
		stock1.setCurrentPrice(324.61);
		System.out.println("The percentage change is " + stock1.changePercent());
		
		Stock stock3 = new Stock("AMZN", "Amazon.com Inc.");
		stock1.setPreviousClosingPrice(3416.00);
		stock1.setCurrentPrice(3335.55);
		System.out.println("The percentage change is " + stock1.changePercent());
	}

}

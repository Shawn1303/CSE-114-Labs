import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		double price, discount = 0, discountedPrice, discountedAmount, totalPrice;
		int quantity;
		System.out.println("Fixed price: \nQuantity: ");
		Scanner inputPrice = new Scanner(System.in);
		price = inputPrice.nextDouble();
		Scanner inputquantity = new Scanner(System.in);
		quantity = inputquantity.nextInt();
		if (quantity >= 100) {
			discount = 0.5;
		}else if (quantity >= 50 && quantity <= 99) {
			discount = 0.4;
		}else if (quantity >= 20 && quantity <= 49) {
			discount = 0.3;
		}else if (quantity >= 10 && discount <= 19) {
			discount = 0.2;
		}else {
			discount = 0;
		}
		discountedPrice = (1-discount) * price;
		discountedAmount = discount * price;
		totalPrice = discountedPrice * quantity;
		System.out.println("Discount: " + 100*discount + "%"
				+ "\nDiscounted price: $" + discountedPrice
				+ "\nDiscounted amount per unit: $" + discountedAmount
				+ "\nTotal price: $" + discountedPrice + "*" + quantity + "= $" + totalPrice);
	}
}

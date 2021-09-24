
public class Kgs_pounds {

	public static void main(String[] args) {
		System.out.println("Kilograms  Pounds  Pounds  Kilograms");
		for (int i = 0; i < 100; i++) {
			int initialKilo = 2 * i + 1;
			double finalLB = (int)(initialKilo * 2.2 * 10) / 10.0;
			int initialLB = 5 * i + 20;
			double finalKilo = ((int)((initialLB / 2.2) * 100)) / 100.0;
			System.out.println(initialKilo + "\t" + finalLB + "\t" + initialLB + "\t" + finalKilo);
		}

	}

}

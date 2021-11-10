
public class ArrayUtils {

	public static void main(String[] args) {
		int[] random = randomArray(100, 21);
		print(random);
		System.out.println("Sum of array is: " + arraySum(random));
		System.out.println("How many 12s?: " + contains(random, 12));
		System.out.println("How many multiples of 7?: " + countMultiplesOf(random, 7));
	}
	
	public static int[] randomArray (int size, int range) {
		int[] random = new int[size];
		for (int i = 0; i < size; i++) {
			random[i] = (int)(Math.random() * range);
		}
		return random;
	}
	
	public static void print(int[] random) {
		for (int elem: random) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}
	
	public static int arraySum(int[] random) {
		int sum = 0;
		for (int elem: random) {
			sum += elem;
		}
		return sum;
	}
	
	public static int contains(int[] random, int num) {
		for (int i = 0; i < random.length; i ++) {
			if (random[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public static int countMultiplesOf(int[] random, int integer) {
		int count = 0;
		for (int elem: random) {
			if(elem % integer == 0) {
				count++;
			}
		}
		return count;
	}

}

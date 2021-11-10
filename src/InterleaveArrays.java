import java.util.Arrays;

public class InterleaveArrays {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(interleaveArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 })));
		System.out.println(Arrays.toString(interleaveArrays(new int[] { 10, 20, 30, 40, 50, 60, 70, 80 }, new int[] { 2, 4, 6, 8 })));
		System.out.println(Arrays.toString(interleaveArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6, 8, 10 })));
		System.out.println(Arrays.toString(interleaveArrays(new int[] { 1, 1, 1, 1, 1, 1 }, new int[] { 2, 2, 2, 2, 2, 2, 2 })));
		System.out.println(Arrays.toString(interleaveArrays(new int[] { 1, 4, 9, 25, 36, 49, 64, 81 }, new int[] { 21, 3, 4, 10, 11, 11, 5 })));
	}

	public static int[] interleaveArrays(int[] array1, int[] array2) {
		int[] combined = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {
			combined[i] = array1[i];
		}
		for (int i = array1.length; i < array1.length + array2.length; i++) {
			combined[i] = array2[i - array1.length];
		}
		int currentMin, currentMinIndex;
		for (int i = 0; i < combined.length; i++) {
			currentMin = combined[i];
			currentMinIndex = i;
			for (int j = i + 1; j < combined.length; j++) {
				if (currentMin > combined[j]) {
					currentMin = combined[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				combined[currentMinIndex] = combined[i];
				combined[i] = currentMin;
			}
		}
		return combined;
	}

}

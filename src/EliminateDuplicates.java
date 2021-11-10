
public class EliminateDuplicates {

	public static void main(String[] args) {
		System.out.println(eliminateDuplicates("abracadabra"));
		System.out.println(eliminateDuplicates("Stony Brook University"));
		System.out.println(eliminateDuplicates("This is a test sentence."));
		System.out.println(eliminateDuplicates("Hello World"));
		System.out.println(eliminateDuplicates("ABab"));
	}

	public static String eliminateDuplicates(String str) {
			String result = "";
			result += str.charAt(0);
			String temp = result;
			for (int i = 1; i < str.length(); i++) {
				for (int j = 0; j < result.length(); j++) {
					if (str.charAt(i) == result.charAt(j)) {
						break;
					} else if (j == result.length() - 1) {
						temp += str.charAt(i);
					}
				}
				result = temp;
			}
			return result;
		}

}

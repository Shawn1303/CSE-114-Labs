
public class Vowels {
	public static int countNumVowels(String str) {
		return str.replaceAll("[^aeiouAEIOU]", "").length();
	}
	public static void main(String[] args) {
		System.out.println(countNumVowels("Stony Brook University"));
		System.out.println(countNumVowels("The quick brown fox jumped over the lazy dog"));
	}

}

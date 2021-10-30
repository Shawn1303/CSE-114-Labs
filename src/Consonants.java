
public class Consonants {
	public static int countConsonants(String str) {
		String letters = str.replaceAll("[^a-zA-Z]", "");
		return letters.length() - letters.replaceAll("[^aeiouAEIOU]", "").length();
	}
	public static void main(String[] args) {
		System.out.println(countConsonants("Stony Brook University"));
		System.out.println(countConsonants("The quick brown fox jumped over the lazy dog"));
	}


}

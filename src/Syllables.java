
public class Syllables {
	public static int countSyllables(String str) {
		int count = 0;
		boolean prevVowel = false;
		for (int i = 0; i < str.length(); i++) {
			if("aeiouAEIOU".indexOf(str.charAt(i)) != -1) {
				if(prevVowel) {
					System.out.println(str.substring(i-1, i+1));
					prevVowel = false;
					count++;
				}
				else {
					prevVowel = true;
				}
			}
			else {
				if(prevVowel) {
					System.out.println(str.charAt(i-1));
					prevVowel = false;
					count++;
				}
			}
		}
		if(prevVowel) {
			System.out.println(str.length()-1);
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countSyllables("aeiou2aeiou2ae2i2ou"));

	}

}

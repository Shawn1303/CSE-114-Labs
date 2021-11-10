
public class MyString1 {
	private char[] chars;
	public MyString1(char[] chars) {
		this.chars = chars;
	}

	public char charAt(int index) {
		return chars[index];
	}

	public int length() {
		return chars.length;
	}

	public MyString1 substring(int begin, int end) {
		char[] array = new char[end - begin];
		for (int i = begin; i < end; i++) {
			array[i - begin] = chars[i];
		}
		return new MyString1(array);
	}

	public MyString1 toLowerCase() {
		char[] array = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			array[i] = Character.toLowerCase(chars[i]);
		}
		
		return new MyString1(array);
	}

	public boolean equals(MyString1 s) {
		if (s.length() != chars.length) return false;
		
		for (int i = 0; i < s.length(); i++) {
			if (chars[i] != s.charAt(i)) return false;
		}
		
		return true;
	}

	public static MyString1 valueOf(int i) {
		int size = 0;
		int number = i;
		while (number != 0) {
			size++;
			number /= 10;
		}
		
		char[] array = new char[size];
		
		int index = 1;
		while (i != 0) {
			int v = i % 10;
			array[size - index] = (char) v;
			i /= 10;
		}
		
		return new MyString1(array);
	}

	public MyString1[] split(String s) {
		MyString1[] array = new MyString1[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			char[] arr = {c};
			array[i] = 	new MyString1(arr);
		}
		return array;
	}
}

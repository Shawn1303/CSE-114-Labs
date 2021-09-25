
public class NumberSystems {

	public static int baseX2decimal(int base, String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			char value = s.charAt(i);
			value -= 48;
			result += (value * Math.pow(base, s.length() - 1 - i));
		}
		return result;
	}

	public static String decimal2BaseX(int base, int dec) {
		String result = "";
		while (dec != 0) {
			int value = dec % base;
			result = String.valueOf(value) + result;
			dec /= base;
		}
		return result;
	}

	public static int hexadecimal2decimal(String hex) {
		int result = 0;
		for (int i = 0; i < hex.length(); i++) {
			char value = hex.charAt(i);
			if (value < 58) {
				value -= 48;
			} else if (value >= 65 && value <= 70) {
				value -= 55;
			}
			result += (value * (Math.pow(16, hex.length() - 1 - i)));
		}
		return result;
	}

	public static String decimal2binary(int n) {
		String binary = "";

		while (n != 0) {
			if (n % 2 == 1) {
				binary = "1" + binary;
			} else {
				binary = "0" + binary;
			}
			n /= 2;
		}
		return binary;
	}

	public static String decimal2hex(int n) {
		String hex = "";
		
		while (n != 0) {
			int value = n % 16;
			if (value < 10) {
				hex = value + hex;
			} else {
				switch (value) {
				case 10: {
					hex = "A" + hex;
					break;
				}
				case 11: {
					hex = "B" + hex;
					break;
				}
				case 12: {
					hex = "C" + hex;
					break;
				}
				case 13: {
					hex = "D" + hex;
					break;
				}
				case 14: {
					hex = "E" + hex;
					break;
				}
				case 15: {
					hex = "F" + hex;	
					break;
				}
				}
			}
			n /= 16;
		}
		return hex;
	}

	public static int binary2decimal(String b) {
		int result = 0;
		
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '1') {
				result += (Math.pow(2, b.length() - 1 - i));
			}
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(hexadecimal2decimal("A1")); // 161

		System.out.println(decimal2binary(10)); // 1010

		System.out.println(decimal2hex(161)); // A1

		System.out.println(binary2decimal("1010")); // 10

	}

}

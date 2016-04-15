package ctc.Arrays;

/*
 * Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa
 * would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, your method should return the
 * original string.
 */

public class StringCompression {

	public static void main(String[] args) {
		String input = "aabcccccaaa";
		System.out.println(compress(input));
	}

	public static String compress(String input) {

		if (input.length() == countCompression(input))
			return input;

		StringBuffer sb = new StringBuffer();
		char last = input.charAt(0);
		int count = 1;

		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == last) {
				count++;
			} else {
				sb.append(last);
				sb.append(count);
				last = input.charAt(i);
				count = 1;
			}
		}

		sb.append(last);
		sb.append(count);

		return sb.toString();
	}

	public static int countCompression(String input) {
		int size = 0;
		int count = 1;
		char last = input.charAt(0);
		for (int i = 1; i < input.length(); i++) {
			if (last == input.charAt(i)) {
				count++;
			} else {
				last = input.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}

		size += 1 + String.valueOf(count).length();
//		System.out.println(input.length());
//		System.out.println(size);
		return size;
	}

}

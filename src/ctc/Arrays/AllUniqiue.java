package ctc.Arrays;

/*
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */

public class AllUniqiue {

	public static void main(String[] args) {
		String input = "abcd";
		String input2 = "abcda";

		System.out.println(isUnique(input));
		System.out.println(isUnique(input2));

	}

	public static boolean isUnique(String input) {
		if (input.length() > 256)
			return false;

		boolean[] char_set = new boolean[256];
		for (int i = 0; i < input.length(); i++) {
			if (char_set[input.charAt(i)]) {
				return false;
			} else {
				char_set[input.charAt(i)] = true;
			}
		}
		return true;
	}

}

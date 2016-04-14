package ctc.Arrays;

/*
 * Given two strings, write a method to decide if one is a permutation of another.
 * 
 */
public class IsPermutation {

	public static void main(String[] args) {
		String a = "abc";
		String b = "cba";

		String c = "aba";
		String d = "abb";

		System.out.println(isPermutation(a, b));
		System.out.println(isPermutation(c, d));
	}

	public static boolean isPermutation(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		return sort(s1).equals(sort(s2));

	}

	public static String sort(String s1) {
		char[] input = s1.toCharArray();
		java.util.Arrays.sort(input);
		return new String(input);
	}

}

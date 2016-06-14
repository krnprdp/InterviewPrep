package leetcode;

import java.util.*;

public class ValidWordAbbr {

	public static HashSet<String> set;

	public ValidWordAbbr(String[] dictionary) {
		
			set = new HashSet<String>();
			for (int i = 0; i < dictionary.length; i++) {
				set.add(Abbr(dictionary[i]));
			}
		
	}

	public static String Abbr(String input) {
		if (input.length() <= 2)
			return input;
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < input.length() - 2; i++)
			count++;
		sb.append(input.charAt(0)).append(count).append(input.charAt(input.length() - 1));
		return sb.toString();
	}

	public static boolean isUnique(String word) {
		System.out.println(set.toString());
		System.out.println(Abbr(word));
		System.out.println(set.contains(Abbr(word)));
		return !set.contains(Abbr(word));
		
	}

	public static void main(String[] args) {

		String[] dict = {"hello"};
		ValidWordAbbr obj = new ValidWordAbbr(dict);

		System.out.println(isUnique("hello"));
	}

}
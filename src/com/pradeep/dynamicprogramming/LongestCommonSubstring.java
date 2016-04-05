package com.pradeep.dynamicprogramming;

public class LongestCommonSubstring {

	public static int lcs(String string1, String string2) {

		int[][] T = new int[string1.length() + 1][string2.length() + 1];
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < string1.length(); i++) {
			for (int j = 0; j < string2.length(); j++) {
				if (string1.charAt(i) == string2.charAt(j)) {
					T[i][j] = T[i - 1][j - 1] + 1;
					if (sb.length()!=0)
						sb.append(", ");
					sb.append(string1.charAt(i));
				} else {
					T[i][j] = 0;
				}
			}
			System.out.println(sb.toString());
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(lcs("abcdaf", "zbcdf"));
	}
}

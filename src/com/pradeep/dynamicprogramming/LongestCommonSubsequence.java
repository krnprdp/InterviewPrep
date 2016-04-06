package com.pradeep.dynamicprogramming;

public class LongestCommonSubsequence {
	public static void LCS(char[] input1, char[] input2) {

		int[][] T = new int[input1.length + 1][input2.length + 1];

		for (int i = 0; i < input1.length; i++) {
			T[i][0] = 0;
		}

		for (int i = 0; i < input2.length; i++) {
			T[0][i] = 0;
		}

		StringBuilder sb = new StringBuilder();
		// Need a fix - getting duplicates??
		for (int i = 1; i < input1.length; i++) {
			for (int j = 1; j < input2.length; j++) {
				if (input1[i] == input2[j]) {
					T[i][j] = T[i - 1][j - 1] + 1;

					if (sb.length() != 0)
						sb.append(", ");
					sb.append(input1[i]);
					
				} else{
					T[i][j] = Math.max(T[i][j-1], T[i-1][j]);
				}
			}
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		String input1 = "abcdaf";
		String input2 = "acbcf";

		LCS(input1.toCharArray(), input2.toCharArray());
	}
}

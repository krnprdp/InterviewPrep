package com.pradeep.dynamicprogramming;

public class LongestIncreasingSubsequence {
	public static int LIS(int[] input) {
		int[] T = new int[input.length];

		for (int k = 0; k < input.length; k++) {
			T[k] = 1;
		}

		for (int i = 1; i < input.length; i++) {
			for (int j = 0; j < i; j++) {
				if (input[j] < input[i]) {
					if (T[i] < T[j] + 1)
						T[i] = T[j] + 1;
				}
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < T.length; i++) {
			System.out.println(T[i]);
			if (max < T[i])
				max = T[i];
		}

		return max;
	}

	public static void main(String[] args) {
		int[] input = { 3, 4, -1, 0, 6, 2, 3 };
		int[] input2 = { 2, 5, 1, 8, 3};
		System.out.println(LIS(input2));
	}
}

package com.pradeep.dynamicprogramming;

public class BinomialCoefficient {

	public static long binomial_coefficient(int n, int k) {
		int i, j;
		long[][] bc = new long[n + 1][n + 1];

		for (i = 0; i <= n; i++) {
			bc[i][0] = 1;
		}

		for (j = 0; j <= n; j++) {
			bc[j][j] = 1;
		}

		for (i = 1; i <= n; i++) {
			for (j = 1; j < i; j++) {
				System.out.println(i + " " + j);
				bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
			}
		}

		return bc[n][k];
	}

	public static void main(String[] args) {
		System.out.println(binomial_coefficient(6, 2));
	}

}

package com.pradeep.projecteuler;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 */
public class Problem3 {
	public static void main(String[] args) {
		long n = Long.parseLong("600851475143");

		for (int i = 2; i < n; i++) {
			if (isPrime(i) && n % i == 0)
				System.out.println(i);
		}
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}
}

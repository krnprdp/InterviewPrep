package com.pradeep.dynamicprogramming;

/*
 * Dynamic Programming solution to finding nth fibonacci number problem.
 * 
 */

public class Fibonacci {

	public static int fib_dp(int n) {
		int fib[] = new int[n + 1];
		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i <= n; i++) {
			System.out.print("\t" + " fib(" + i + ") ->\n");
			fib[i] = fib[i - 1] + fib[i - 2];
			System.out.println("fib(" + i + ") = " + fib[i]);
		}
		return fib[n];
	}

	public static long fib_ultimate(int n) {
		int back1 = 0;
		int back2 = 1;
		int next = 0;
		for (int i = 2; i <= n; i++) {
			next = back1 + back2;
			back1 = back2;
			back2 = next;
		}
		return next;
	}

	public static void main(String[] args) {
		
		int i = 9;
		
		System.out.println(fib_dp(i));
		System.out.println("Using fib_ultimate: "+fib_ultimate(i));
	}
}

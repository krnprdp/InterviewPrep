package com.pradeep.dynamicprogramming;

/*
 * Dynamic Programming solution to finding nth fibonacci number problem.
 * 
 */

public class Fibonacci {

	public static int fib_dp(int n) {
		int fib[] = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i <= n; i++)
			fib[i] = fib[i - 1] + fib[i - 2];

		return fib[n];
	}
	
	public static void main(String[] args){
		System.out.println(fib_dp(8));
	}
}

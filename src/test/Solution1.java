package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] Args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] Fib = new int[n + 1];

		System.out.print("The first " + n + " Fibonacci numbers are: ");

		// Finding the fibonacci sequence for n
		Fib[0] = 0;
		Fib[1] = 1;
		for (int i = 2; i <= n; i++) {
			Fib[i] = Fib[i - 1] + Fib[i - 2];
		}

		// Printing the fibonacci sequence and checking if every number in it is prime
		for (int j = 1; j <= n; j++) {
			System.out.print(Fib[j] + " ");
			if (Fib[j] != 1 && checkIsPrime(Fib[j])) {
				arr.add(Fib[j]);
			}
		}

		System.out.print("\nPrime numbers of the above sequence are: ");
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}

	public static boolean checkIsPrime(int c) {

		for (int i = 2; i < c; i++) {
			if (c % i == 0) {
				return false;
			}
		}
		return true;
	}
}

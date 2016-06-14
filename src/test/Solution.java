package test;

import java.io.*;
import java.util.*;

class Solution {
	public static void main(String[] Args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print("The first " + n + " Fibonacci numbers are: ");
		int[] op = Fib(n);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int j = 1; j <= n; j++) {
			System.out.print(op[j] + " ");
			if (op[j]!=1 && checkPrime(op[j])) {
				arr.add(op[j]);
			}
		}
		System.out.println();
		System.out.print("Prime numbers of the above sequence are: ");
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}

	public static int[] Fib(int n) {
		int[] op = new int[n+1];
		op[0] = 0;
		op[1] = 1;
		for (int i = 2; i <= n; i++) {
			op[i] = op[i - 1] + op[i - 2];
		}
		return op;
	}

public static boolean checkPrime(int c)
{
for(int i=2;i<c;i++)
   {
   if(c%i==0)
   {
   return false;
   }
   }
return true;
}
}

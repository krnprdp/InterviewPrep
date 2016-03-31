package com.pradeep.sortingalgorithms;

/*
 * In place and stable sorting algorithm
 * Best case time complexity 	-	O(N)
 * Average case time complexity - 	O(N^2)
 * Worst case time complexity 	- 	O(N^2)
 */
public class BubbleSort {
	public static int[] sort(int[] A) {
		int n = A.length;

		for (int k = 1; k < n; k++) {
			for (int i = 0; i < n - k; i++) {
				if (A[i] > A[i + 1]) {
					int temp = A[i + 1];
					A[i + 1] = A[i];
					A[i] = temp;
				}
			}
		}
		return A;
	}

	public static void main(String[] args) {
		int[] A = { 2, 7, 4, 1, 5, 3 };
		int[] Sorted = sort(A);
		for (int i = 0; i < Sorted.length; i++) {
			System.out.println(Sorted[i]);
		}
	}

}

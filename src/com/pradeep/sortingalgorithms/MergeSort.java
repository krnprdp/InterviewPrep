package com.pradeep.sortingalgorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] unsorted = { 4, 1, 9, 6, 0, 2, 5 };
		
		System.out.println("Unsorted array: ");
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + "\t");
		}
		System.out.println();
		
		mergeSort(unsorted);
		
		System.out.println("\n\nSorted Array: ");
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + "\t");
		}

	}

//	public static int[] mergeSort(int[] input) {
//		int[] op = new int[input.length];
//		mergeSort(input);
//		return op;
//	}

	public static void mergeSort(int[] input) {

		int size = input.length;

		if (size <= 1)
			return;

		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
 
		for (int i = 0; i < mid; i++) {
			left[i] = input[i];
		}
		
		for (int j = mid; j < size; j++) {
			right[j - mid] = input[j];
		}

		mergeSort(left);
		mergeSort(right);
		System.out.println("L: " + Arrays.toString(left));
		System.out.println("R: " + Arrays.toString(right));
		System.out.println("before merge T: " + Arrays.toString(input));
		merge(left, right, input);
		System.out.println("after merge T: " + Arrays.toString(input));

	}

	public static void merge(int[] left, int[] right, int[] input) {

		int leftSize = left.length;
		int rightSize = right.length;

		int leftPtr = 0, rightPtr = 0, tempPtr = 0;
		
		while (leftPtr < leftSize && rightPtr < rightSize) {
			if (left[leftPtr] <= right[rightPtr]) {
				input[tempPtr++] = left[leftPtr++];
			} else {
				input[tempPtr++] = right[rightPtr++];
			}
		}

		while (leftPtr < leftSize) {
			input[tempPtr++] = left[leftPtr++];
		}

		while (rightPtr < rightSize) {
			input[tempPtr++] = right[rightPtr++];
		}
	}
}
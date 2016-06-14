package com.pradeep.sortingalgorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] unsorted = { 4, 1, 9, 6, 3};//, 0, 2, 5, 8, 7 };

		int[] sorted = mergeSort(unsorted);

		System.out.println("Unsorted array: ");
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + "\t");
		}

		System.out.println("\n\nSorted Array: ");
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + "\t");
		}

	}

	public static int[] mergeSort(int[] input) {
		int[] op = new int[input.length];
		mergeSort(input, op, 0, input.length - 1);
		System.out.println(Arrays.toString(op));
		return op;
	}

	public static void mergeSort(int[] input, int[] temp, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
//			System.out.println("low|high:" + low + " " + high);
			mergeSort(input, temp, low, mid);
			mergeSort(input, temp, mid + 1, high);

			merge(input, temp, low, high);
		}
	}

	public static void merge(int[] input, int[] temp, int low, int high) {

		int mid = (low + high) / 2;
		int left = low;
		int right = mid + 1;

		int i = low;
		while (left <= mid && right <= high) {
			if (input[left] <= input[right]) {
				temp[i] = input[left];
				left++;
			} else {
				temp[i] = input[right];
				right++;
			}
			i++;
		}

		while (left <= mid) {
			temp[i] = input[left];
			i++;
			left++;
		}

		while (right <= high) {
			temp[i] = input[right];
			i++;
			right++;
		}

	}
}

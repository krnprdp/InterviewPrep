package com.pradeep.sortingalgorithms;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 53, 12, 35, 21, 59, 15 };
		for (int i : arr)
			System.out.print(i + " ");
		
		System.out.println();
		sort(arr,arr.length);
		for (int i : arr)
			System.out.print(i + " ");
		
	}

	public static void sort(int[] arr,int n){
		
		for (int j = 1; j < n; j++){
			int key = arr[j];
			int i = j - 1;
			
			while (i >= 0 && arr[i] > key){
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
	}
}

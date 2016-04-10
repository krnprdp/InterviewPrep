package searchingalgorithms;

public class BinarySearch {
	
	// iterative solution to binary search algorithm

	public static int BinSearch_iterative(int[] input, int element){
		
		int low = 0;
		int high = input.length - 1;
		int mid;
		while (low <= high){
			mid = low + (high - low)/2 ; // to avoid overflow
			
			if (input[mid] == element)
				return mid;
			else if (input[mid] < element)
				low = mid + 1;
			else high = high + 1;
			
		}
				
		
		return -1;
	}
	
	public static void main(String[] args){
		
		int[] input = {4,3,7,1,2,5};
		int data = 2;
		
		System.out.println(BinSearch_iterative(input, data));
		
		
	}
	
}

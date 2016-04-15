package ctc.Arrays;

/*
 * Implement a function which reverses a null-terminated string (asked to implement in c/c++)
 */
public class ReverseString {
	public static void main(String[] args) {
		
		String input = "abcdef";
		
		System.out.println(reverseString(input.toCharArray()));
		
	}
	
	public static String reverseString(char[] input){
		
		int i = 0;
		int j = input.length - 1;
		
		while (i < j) {
			char temp = input[i];
			input[i] = input[j];
			input[j] = temp;
			i++;
			j--;
		}
		
		return new String(input);
	}
	
}

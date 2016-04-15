package ctc.Arrays;

/*
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space
 * at the end of the string to hold the additional  characters, and that you are given the 'true length' of the string.
 * (Note: if implementing in java, please use a character array so that you can perform this operation in place.)
 * 
 */

public class ReplaceAllSpaces {

	public static void main(String[] args) {
		String input = "h e ll o ";
		char[] input_chars = input.toCharArray();
		replaceSpaces(input_chars, input.length());

		System.out.println(new String(input_chars));

	}

	public static void replaceSpaces(char[] input, int length) {
		int spaceCount = 0;
		int i, newLength;

		for (i = 0; i < length; i++) {
			if (input[i] == ' ') {
				spaceCount++;
			}
		}

		newLength = length + spaceCount * 2;
		input[newLength - 1] = '\0';

		for (i = newLength; i >= 0; i--) {
			if (input[i] == ' ') {
				input[newLength - 1] = '0';
				input[newLength - 2] = '2';
				input[newLength - 3] = '%';
				newLength -= 3;
			} else {
				input[newLength - 1] = input[i];
				newLength -= 1;
			}
		}

	}

}

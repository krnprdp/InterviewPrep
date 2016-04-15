package ctc.Arrays;

/*
 * Given an image represented by an N*N matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90º. Can you do this in place?
 */
public class RotateMatrix {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printMatrix(matrix);
		rotateMatrix(matrix);
		System.out.println();
		printMatrix(matrix);
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void rotateMatrix(int[][] matrix) {

		for (int layer = 0; layer < matrix.length / 2; layer++) {
			int first = layer;
			int last = matrix.length - 1 - layer;

			for (int i = first; i < last; i++) {
				int offset = i - first;

				// store top value
				int top = matrix[first][i];

				// swap left into top
				matrix[first][i] = matrix[last - offset][first];

				// swap bottom into left
				matrix[last - offset][first] = matrix[last][last - offset];

				// swap right into bottom
				matrix[last][last - offset] = matrix[i][last];

				// swap top into right
				matrix[i][last] = top;
			}

		}

	}

}

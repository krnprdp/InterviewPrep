package ctc.Arrays;

public class SetRowColumnToZero {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printMatrix(matrix);
		setRowColumnToZero(matrix);
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

	public static void setRowColumnToZero(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (row[i] || col[j]) {
					matrix[i][j] = 0;
				}
			}
		}

	}

}

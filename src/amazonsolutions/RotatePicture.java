package amazonsolutions;

public class RotatePicture {

	public static int[][] rotatePictureMethod(int[][] matrix, int flag) {
		int rowCount = matrix.length;
		int colCount = matrix[0].length;

		int[][] output = new int[rowCount][colCount];

		if (flag == 1) {
			output = rotatePictureClockwise(matrix, rowCount, colCount);
		} else {
			output = rotatePictureAntiClockwise(matrix, rowCount, colCount);
		}

		return output;
	}

	public static int[][] rotatePictureClockwise(int[][] matrix, int rowCount, int colCount) {

		int[][] clockwiseMatrix = new int[rowCount][colCount];
		int curRow = 0;
		int curCol = 0;

		for (int i = rowCount - 1; i >= 0; i--) {
			for (int j = 0; j < colCount; j++) {
				clockwiseMatrix[i][j] = matrix[curRow][curCol];
				curCol++;
			}
			curRow++;
			curCol = 0;
		}

		return clockwiseMatrix;

	}

	public static int[][] rotatePictureAntiClockwise(int[][] matrix, int rowCount, int colCount) {

		int[][] antiClockwiseMatrix = new int[colCount][rowCount];
		int curRow = 0;
		int curCol = colCount - 1;

		for (int i = 0; i < colCount; i++) {
			for (int j = 0; j < rowCount; j++) {
				antiClockwiseMatrix[j][i] = matrix[curRow][curCol];
				curRow++;
			}
			curCol--;
			curRow = 0;
		}

		return antiClockwiseMatrix;

	}
}

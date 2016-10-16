package arrays.strings;

public class SetZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void setZeroes(int[][] matrix) {

		boolean isRowZero = false;
		boolean isColZero = false;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				isColZero = true;
				break;
			}
		}

		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				isRowZero = true;
				break;
			}
		}

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0)
					matrix[i][j] = 0;
			}
		}

		if (isColZero)
			for (int i = 0; i < matrix.length; i++)
				matrix[i][0] = 0;

		if (isRowZero)
			for (int i = 0; i < matrix[0].length; i++)
				matrix[0][i] = 0;

	}

}

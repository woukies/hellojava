package redo;

public class IrregularArray2 {
	public static void main(String[] args) {
		int[][] array = new int[5][];
		int[] arraySize = { 5, 1, 4, 2, 3 };

		for (int i = 0; i < array.length; i++) {
			array[i] = new int[arraySize[i]];
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (i + 3) * 10 + (j + 5);
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}

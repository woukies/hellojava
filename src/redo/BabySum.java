package redo;

public class BabySum {
	public static void main(String[] args) {
		int[][] array = new int[120][5];
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (i + 1) * 100 + (j + 1);
				sum += array[i][j];
			}
		}

		System.out.println("10년간 5개 나라의 총 신생아수는 " + sum);
	}
}

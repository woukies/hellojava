package redo;

public class CoronaSum {
	public static void main(String[] args) {
		int[][] array = new int[12][3];
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (i + 1) * 10 + (j + 1);
				sum += array[i][j];
			}
		}

		System.out.println("1년 전체 코로나 환자 수는 " + sum);
	}
}

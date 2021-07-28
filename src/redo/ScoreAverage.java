package redo;

public class ScoreAverage {

	public static void main(String[] args) {
		double[][] score = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };
		double sum;

		sum = 0;
		for (double[] year : score) {
			for (double term : year) {
				sum += term;
			}
		}
		System.out.println("전체 평균: " + sum / (score.length * score[0].length));

		sum = 0;
		for (int year = 0; year < score.length; year++) {
			for (int term = 0; term < score[year].length; term++) {
				sum += score[year][term];
			}
		}
		System.out.println("전체 평균: " + sum / (score.length * score[0].length));

	}
}

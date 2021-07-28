package doing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _ReviewQ1 {

	public static void main(String[] args) {
		// 숫자 5개 입력 -> 합계, 평균, 최대값, 최소값
		// 배열 동적 ... 써보기

		Scanner scanner = new Scanner(System.in);

		final int inputOfNumber = 5;
		int[] input = new int[inputOfNumber];

		int max = input[0];
		int min = input[0];
		double avg = 0;
		int sum = 0;

		for (int i = 0; i < inputOfNumber; i++) {
			try {
				System.out.printf("Input integer[%d]: ", i + 1);
				input[i] = scanner.nextInt();

				sum += input[i];

				if (i == 0) {
					max = input[i];
					min = input[i];
				} else if (max < input[i]) {
					max = input[i];
				} else if (min > input[i]) {
					min = input[i];
				}

			} catch (InputMismatchException e) {
				scanner = new Scanner(System.in);
				i--;
			}
		}

		avg = (double) sum / inputOfNumber;

		System.out.println();
		System.out.printf("MAX = %d, MIN = %d, AVG = %.2f, SUM = %d\n", max, min, avg, sum);
		System.out.println("> EXIT");

		scanner.close();
	}

}

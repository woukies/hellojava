package doing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _ReviewQ2 {

	public static void main(String[] args) {
		// 숫자 n 받아서 n*n 배열 출력
		// 행열 바꿔보기

		Scanner scanner = new Scanner(System.in);

		int arraySize;
		int arrayValue = 1;
		int[][] array;

		while (true) {
			try {
				System.out.print("Input Array size(n > 0): ");
				arraySize = scanner.nextInt();
				if (arraySize > 0) {
					break;
				} else {
					scanner = new Scanner(System.in);
					continue;
				}
			} catch (InputMismatchException e) {
				scanner = new Scanner(System.in);
				continue;
			}
		}

		array = new int[arraySize][arraySize];

		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize; j++) {
				array[j][i] = arrayValue++;
			}
		}

		for (int i[] : array) {
			for (int j : i) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}

		System.out.println("> EXIT");
		scanner.close();
	}

}

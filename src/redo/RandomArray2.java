package redo;

import java.util.Scanner;

public class RandomArray2 {
	public static boolean exists(int[] array, int index, int value) {
		for (int i = 0; i < index; i++) {
			if (array[i] == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arrayInt;
		int arraySize;

		System.out.print("정수 몇개? ");
		arraySize = scanner.nextInt();
		arrayInt = new int[arraySize];

		for (int i = 0, randomInt = 0; i < arrayInt.length; i++) {
			randomInt = (int) (Math.random() * 100 + 1);
			if (exists(arrayInt, i, randomInt)) {
				i--;
			} else {
				arrayInt[i] = randomInt;
			}
		}

//		Arrays.sort(arrayInt);

		for (int i = 0; i < arrayInt.length; i++) {
			System.out.printf("%4d", arrayInt[i]);
			if ((i + 1) % 10 == 0 && i > 0) {
				System.out.println();
			}
		}

		scanner.close();
	}
}

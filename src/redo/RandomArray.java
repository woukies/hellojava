package redo;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArray;
		int arraySize;

		System.out.print("정수 몇개? ");
		arraySize = scanner.nextInt();
		intArray = new int[arraySize];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100 + 1);
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.printf("%4d", intArray[i]);
			if ((i + 1) % 10 == 0 && i > 0) {
				System.out.println();
			}
		}

		scanner.close();
	}
}

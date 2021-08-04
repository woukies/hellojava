package redo;

import java.util.Scanner;

public class ArrayMin {
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arrayInt = new int[7];
		System.out.println("양수 7개를 입력하세요.");
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = scanner.nextInt();
		}

		System.out.println("가장 작은 수는 " + min(arrayInt) + "입니다.");

		scanner.close();
	}
}

package redo;

import java.util.Scanner;

public class ArrayTen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[10];
		int sum = 0;

		System.out.print("10개의 정수를 입력하세요>>");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			sum += array[i];
		}

		System.out.println("합계는 " + sum);
		scanner.close();
	}

}

package redo;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[5];
		int sum = 0;

		System.out.println(intArray.length + "개의 정수를 입력하세요>>");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}

		System.out.printf("평균은 %.2f\n", (double) sum / intArray.length);

		scanner.close();
	}
}

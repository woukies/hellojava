package redo;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number[] = new int[5];
		int max = -1;

		System.out.println("양수 5개를 입력하세요");
		for (int i = 0; i < number.length; i++) {
			number[i] = scanner.nextInt();
			if (max < number[i]) {
				max = number[i];
			}
		}

		System.out.println("가장 큰 수는 " + max + "입니다.");
		scanner.close();
	}

}

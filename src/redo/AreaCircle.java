package redo;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("반지름을 입력하세요>> ");
		int num = scanner.nextInt();
		double circle = num * num * 3.14;
		System.out.printf("원의 면적은 %.1f입니다.", circle);

		scanner.close();
	}
}

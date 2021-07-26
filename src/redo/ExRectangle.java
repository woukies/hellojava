package redo;

import java.util.Scanner;

public class ExRectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2;

		System.out.print("2개의 정수 입력>>");

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		System.out.println("두 수 의 합은 " + (num1 + num2));
		System.out.println("두 수 의 곱은 " + (num1 * num2));

		scanner.close();
	}

}

package redo;

import java.util.Scanner;

public class ExRectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2;

		System.out.print("2���� ���� �Է�>>");

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		System.out.println("�� �� �� ���� " + (num1 + num2));
		System.out.println("�� �� �� ���� " + (num1 * num2));

		scanner.close();
	}

}

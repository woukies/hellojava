package redo;

import java.util.Scanner;

public class ExCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("2���� �Ǽ� �Է�>>");

		double a, b;

		a = scanner.nextDouble();
		b = scanner.nextDouble();

		System.out.println("�� ���� ������ " + (a + b));
		System.out.println("�� ���� ������ " + (a - b));
		System.out.println("�� ���� ������ " + (a * b));
		System.out.println("�� ���� �������� " + (a / b));

		scanner.close();
	}

}

package redo;

import java.util.Scanner;

public class ExSumMultiply {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.print("3�ڸ��� ���� �Է�(100~999)>>");

		number = scanner.nextInt();

		System.out.println("100�� �ڸ��� 10�� �ڸ��� ���� " + ((number / 100) + ((number % 100) / 10)));
		System.out.println("10�� �ڸ��� 1�� �ڸ��� ���� " + (((number % 100) / 10) * (number % 10)));
		
		scanner.close();
	}

}

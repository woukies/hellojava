package redo;

import java.util.Scanner;

public class DivAndRemains {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		number = scanner.nextInt();
		if ((number % 10) == (number / 10)) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		} else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}

		scanner.close();
	}

}

package redo;

import java.util.Scanner;

public class TaxiFare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int income = 0, fare;

		for (int i = 0; i < 10; i++) {
			System.out.print("����� �Է��ϼ���: ");
			fare = scanner.nextInt();
			income += fare;
		}

		System.out.println("�� ����: " + income);

		scanner.close();
	}

}

package redo;

import java.util.Scanner;

public class Won2Dollar {

	public static void main(String[] args) {
		final double rate = 1100.0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int money = scanner.nextInt();

		System.out.printf("%d���� $%.1f�Դϴ�..", money, money / rate);

		scanner.close();
	}

}

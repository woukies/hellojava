package redo;

import java.util.Scanner;

public class ExExchange {

	public static void main(String[] args) {
		final double rateDollar = 1200.0;
		final double rateEuro = 1500.0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int money = scanner.nextInt();

		System.out.printf("%d���� $%.1f�Դϴ�..\n", money, money / rateDollar);
		System.out.printf("%d���� E%.1f�Դϴ�..\n", money, money / rateEuro);

		scanner.close();
	}

}

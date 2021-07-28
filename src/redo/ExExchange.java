package redo;

import java.util.Scanner;

public class ExExchange {

	public static void main(String[] args) {
		final double rateDollar = 1200.0;
		final double rateEuro = 1500.0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("원화를 입력하세요(단위 원)>>");
		int money = scanner.nextInt();

		System.out.printf("%d원은 $%.1f입니다..\n", money, money / rateDollar);
		System.out.printf("%d원은 E%.1f입니다..\n", money, money / rateEuro);

		scanner.close();
	}

}

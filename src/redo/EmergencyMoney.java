package redo;

import java.util.Scanner;

public class EmergencyMoney {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int dollar = 1200;
		int support;
		int dollarOf100, dollarOf10;

		System.out.print("가구수를 입력하시오>> ");
		support = scanner.nextInt();

		support = (20 + support * 20) * 10000;

		dollarOf100 = (support / dollar) / 100;
		dollarOf10 = ((support / dollar) % 100) / 10;
		System.out.println("100달러 짜리 " + dollarOf100 + "매");
		if (dollarOf10 > 0) {
			System.out.println("10달러 짜리 " + dollarOf10 + "매");
		}

		scanner.close();
	}

}

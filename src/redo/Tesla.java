package redo;

import java.util.Scanner;

public class Tesla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int tesla = 520;
		int purchase;

		System.out.print("매수 수량을 입력하시오>> ");
		purchase = scanner.nextInt();

		purchase *= tesla;
		System.out.printf("100달러 짜리 %d매\n", purchase / 100);
		if ((purchase % 100) > 0) {
			System.out.printf("10달러 짜리 %d매\n", (purchase % 100) / 10);
		}

		scanner.close();
	}

}

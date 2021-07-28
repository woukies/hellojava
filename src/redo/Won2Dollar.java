package redo;

import java.util.Scanner;

public class Won2Dollar {

	public static void main(String[] args) {
		final double rate = 1100.0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("원화를 입력하세요(단위 원)>>");
		int money = scanner.nextInt();

		System.out.printf("%d원은 $%.1f입니다..", money, money / rate);

		scanner.close();
	}

}

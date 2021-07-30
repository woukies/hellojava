package redo;

import java.util.Scanner;

public class ChangeMoney {
	final static int[] moneyN = { 50000, 10000, 1000, 100, 50, 10, 1 };
	final static String[] moneyS = { "오만원권", "만원권", "천원권", "백원", "오십원", "십원", "일원" };
	// final static int 오만원 = 50000; // 한글명 변수도 가능

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int price;

		System.out.print("금액을 입력하시오>> ");
		price = scanner.nextInt();

		for (int i = 0; i < moneyN.length; i++) {
			System.out.println(moneyS[i] + ": " + price / moneyN[i] + (moneyN[i] < 1000 ? "개" : "매"));
			price %= moneyN[i];
		}

		scanner.close();
	}

}

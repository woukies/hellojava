package redo;

import java.util.Scanner;

public class ChangeMoney {
	final static int[] unit = { 50000, 10000, 1000, 100, 50, 10, 1 };
//	final static String[] moneyS = { "오만원권", "만원권", "천원권", "백원", "오십원", "십원", "일원" };
//	final static int 오만원 = 50000; // 한글명 변수도 가능

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int price;

		System.out.print("금액을 입력하시오>> ");
		price = scanner.nextInt();

		for (int i = 0; i < unit.length; i++) {
			if (price / unit[i] == 0) {
				continue;
			}
//			(moneyN[i] < 1000 ? "개" : "매")
			System.out.println(unit[i] + "원 짜리: " + price / unit[i] + "개");
			price %= unit[i];
		}

		scanner.close();
	}

}

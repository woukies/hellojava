package redo;

import java.util.Scanner;

public class ExStock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dollar, kospi;

		System.out.print("코스피 지수를 입력하세요(1800~2500): ");
		kospi = scanner.nextInt();
		System.out.print("환율을 입력하세요(1100~1200): ");
		dollar = scanner.nextInt();
		if (kospi >= 2300) {
			System.out.println("상승장");
		} else if (kospi >= 2000) {
			if (dollar >= 1150 && kospi >= 2200) {
				System.out.println("상승장");
			} else {
				System.out.println("횡보장");
			}
		} else {
			System.out.println("하락장");
		}

		scanner.close();
	}

}

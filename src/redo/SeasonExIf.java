package redo;

import java.util.Scanner;

public class SeasonExIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month;
		String season;

		System.out.print("달을 입력하세요(1~12)>>");
		month = scanner.nextInt();
		if (3 <= month && month <= 5) {
			season = "봄";
		} else if (6 <= month && month <= 8) {
			season = "여름";
		} else if (9 <= month && month <= 11) {
			season = "가을";
		} else if (12 == month || (1 <= month && month <= 2)) {
			season = "겨울";
		} else {
			season = "잘못 입력";
		}

		System.out.println(season);

		scanner.close();
	}

}

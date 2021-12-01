package test;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("임의의 해를 입력하세요: ");
				int year = scanner.nextInt();
				if (year == -1) {
					break;
				}
				System.out.println(" - 서기 " + year + "년 1월 1일은 " + getDay(year) + "입니다.");
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
				scanner.nextLine();
			}
		}

		System.out.println("프로그램 종료");
		scanner.close();
	}

	public static String getDay(int year) {
		int day = 0; // 1월 1일
		String weekday = "";
		for (int i = 1; i < year; i++) {
			day += 365;
			if (i % 4 == 0) {
				day += 1;
			}
			if (i % 100 == 0) {
				day -= 1;
			}
			if (i % 400 == 0) {
				day += 1;
			}
		}

		switch (day % 7) {
		case 0:
			weekday = "월요일";
			break;
		case 1:
			weekday = "화요일";
			break;
		case 2:
			weekday = "수요일";
			break;
		case 3:
			weekday = "목요일";
			break;
		case 4:
			weekday = "금요일";
			break;
		case 5:
			weekday = "토요일";
			break;
		case 6:
			weekday = "일요일";
			break;
		}

		return weekday;
	}
}

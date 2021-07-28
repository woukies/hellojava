package redo;

import java.util.Scanner;

public class SeasonExSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month;
		String season;

		System.out.print("달을 입력하세요(1~12)>>");
		month = scanner.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		default:
			season = "잘못 입력";
			break;
		}

		System.out.println(season);

		scanner.close();

	}

}

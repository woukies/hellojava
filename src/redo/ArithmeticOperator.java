package redo;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int seconds;
		int calcHour, calcMinute, calcSecond;

		System.out.print("정수를 입력하세요: ");
		seconds = scanner.nextInt();

		calcSecond = seconds % 60;
		calcMinute = (seconds / 60) % 60;
		calcHour = (seconds / 60) / 60;

		System.out.printf("%d초는 %d시간, %d분, %d초입니다.\n", seconds, calcHour, calcMinute, calcSecond);

		scanner.close();
	}
}

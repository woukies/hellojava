package redo;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int seconds;
		int calcHour, calcMinute, calcSecond;

		System.out.print("������ �Է��ϼ���: ");
		seconds = scanner.nextInt();

		calcSecond = seconds % 60;
		calcMinute = (seconds / 60) % 60;
		calcHour = (seconds / 60) / 60;

		System.out.printf("%d�ʴ� %d�ð�, %d��, %d���Դϴ�.\n", seconds, calcHour, calcMinute, calcSecond);

		scanner.close();
	}
}

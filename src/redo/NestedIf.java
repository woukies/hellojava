package redo;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int grade, score;
		boolean result;

		System.out.print("������ �Է��ϼ���(0~100): ");
		score = scanner.nextInt();
		System.out.print("�г��� �Է��ϼ���(1~4): ");
		grade = scanner.nextInt();

		if (score >= 60) {
			result = true;
			if (grade == 4 && score < 70) {
				result = false;
			}
		} else {
			result = false;
		}

		System.out.println(result ? "�հ�!" : "���հ�!");

		scanner.close();
	}

}

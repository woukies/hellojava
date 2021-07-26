package redo;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int grade, score;
		boolean result;

		System.out.print("점수를 입력하세요(0~100): ");
		score = scanner.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
		grade = scanner.nextInt();

		if (score >= 60) {
			result = true;
			if (grade == 4 && score < 70) {
				result = false;
			}
		} else {
			result = false;
		}

		System.out.println(result ? "합격!" : "불합격!");

		scanner.close();
	}

}

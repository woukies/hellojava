package redo;

import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
		boolean cheating;
		int attendrate, totalscore;
		String grade;
		Scanner scanner = new Scanner(System.in);

		System.out.print("부정 행위 여부(true or false): ");
		cheating = scanner.nextBoolean();
		System.out.print("출석률(0 ~ 100 사이의 정수값): ");
		attendrate = scanner.nextInt();
		System.out.print("총점(0 ~ 100 사이의 정수값): ");
		totalscore = scanner.nextInt();

		if (cheating || attendrate < 80) {
			grade = "F";
		} else {
			if (totalscore >= 90) {
				grade = "A";
			} else if (totalscore >= 80) {
				grade = "B";
			} else if (totalscore >= 70) {
				grade = "C";
			} else if (totalscore >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
		}
		System.out.print("학점 = " + grade);

		scanner.close();
	}

}

package redo;

import java.util.Scanner;

public class SeasonExIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month;
		String season;

		System.out.print("���� �Է��ϼ���(1~12)>>");
		month = scanner.nextInt();
		if (3 <= month && month <= 5) {
			season = "��";
		} else if (6 <= month && month <= 8) {
			season = "����";
		} else if (9 <= month && month <= 11) {
			season = "����";
		} else if (12 == month || (1 <= month && month <= 2)) {
			season = "�ܿ�";
		} else {
			season = "�߸� �Է�";
		}

		System.out.println(season);

		scanner.close();
	}

}

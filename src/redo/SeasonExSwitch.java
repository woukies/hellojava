package redo;

import java.util.Scanner;

public class SeasonExSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month;
		String season;

		System.out.print("���� �Է��ϼ���(1~12)>>");
		month = scanner.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		default:
			season = "�߸� �Է�";
			break;
		}

		System.out.println(season);

		scanner.close();

	}

}

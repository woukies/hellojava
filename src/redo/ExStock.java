package redo;

import java.util.Scanner;

public class ExStock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dollar, kospi;

		System.out.print("�ڽ��� ������ �Է��ϼ���(1800~2500): ");
		kospi = scanner.nextInt();
		System.out.print("ȯ���� �Է��ϼ���(1100~1200): ");
		dollar = scanner.nextInt();
		if (kospi >= 2300) {
			System.out.println("�����");
		} else if (kospi >= 2000) {
			if (dollar >= 1150 && kospi >= 2200) {
				System.out.println("�����");
			} else {
				System.out.println("Ⱦ����");
			}
		} else {
			System.out.println("�϶���");
		}

		scanner.close();
	}

}

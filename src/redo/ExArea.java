package redo;

import java.util.Scanner;

public class ExArea {

	public static void main(String[] args) {
		int[] num = new int[3];
		Scanner scanner = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�>>");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}

		if (num[2] == 0) {
			System.out.println("�ﰢ���� ���̴� " + (num[0] * num[1]) / 2.0);
		} else {
			System.out.println("��ٸ����� ���̴� " + (num[0] + num[1]) * num[2] / 2.0);
		}

		scanner.close();
	}

}

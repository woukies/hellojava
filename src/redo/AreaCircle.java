package redo;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�������� �Է��ϼ���>> ");
		int num = scanner.nextInt();
		double circle = num * num * 3.14;
		System.out.printf("���� ������ %.1f�Դϴ�.", circle);

		scanner.close();
	}
}

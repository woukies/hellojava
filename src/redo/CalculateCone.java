package redo;

import java.util.Scanner;

public class CalculateCone {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double radius, height, volume;

		System.out.print("���� ���� ���� �������� �Է��ϼ���: ");
		radius = scanner.nextInt();
		System.out.print("������ ���̸� �Է��ϼ���: ");
		height = scanner.nextInt();
		volume = radius * radius * Math.PI * height / 3;
		System.out.println("���� ���� ���� ������: " + radius);
		System.out.println("������ ����: " + height);
		System.out.println("������ ����: " + volume);
		
		scanner.close();
	}
}

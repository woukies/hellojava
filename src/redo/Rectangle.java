package redo;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int xPoint, yPoint;
		System.out.println("��(x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		xPoint = scanner.nextInt();
		yPoint = scanner.nextInt();

		System.out.printf("(%d, %d)�� �簢�� �ȿ� %s.\n", xPoint, yPoint,
				(200 >= xPoint && xPoint >= 100 && 200 >= yPoint && yPoint >= 100) ? "�ֽ��ϴ�" : "�����ϴ�");

		scanner.close();
	}

}

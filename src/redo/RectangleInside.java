package redo;

import java.util.Scanner;

public class RectangleInside {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int xPoint, yPoint;
		System.out.println("점(x,y)의 좌표를 입력하시오>>");
		xPoint = scanner.nextInt();
		yPoint = scanner.nextInt();

		System.out.printf("(%d, %d)는 사각형 안에 %s.\n", xPoint, yPoint,
				(200 >= xPoint && xPoint >= 100 && 200 >= yPoint && yPoint >= 100) ? "있습니다" : "없습니다");

		scanner.close();
	}

}

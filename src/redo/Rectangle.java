package redo;

import java.util.Scanner;

public class Rectangle {
	int width, height;

	public int getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Rectangle rect = new Rectangle();
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();

		System.out.println("사각형 면적: " + rect.getArea());

		scanner.close();
	}
}

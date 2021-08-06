package redo;

import java.util.Scanner;

public class Trapezoid {
	int down, up, height;

	double getArea() {
		return (down + up) * height / 2.0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Trapezoid t = new Trapezoid();

		System.out.print(">>");
		t.down = scanner.nextInt();
		t.up = scanner.nextInt();
		t.height = scanner.nextInt();

		System.out.println("사다리꼴의 면적은 " + t.getArea());

		scanner.close();
	}
}

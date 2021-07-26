package redo;

import java.util.Scanner;

public class ExCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("2°³ÀÇ ½Ç¼ö ÀÔ·Â>>");

		double a, b;

		a = scanner.nextDouble();
		b = scanner.nextDouble();

		System.out.println("µÎ ¼öÀÇ µ¡¼ÀÀº " + (a + b));
		System.out.println("µÎ ¼öÀÇ »¬¼ÀÀº " + (a - b));
		System.out.println("µÎ ¼öÀÇ °ö¼ÀÀº " + (a * b));
		System.out.println("µÎ ¼öÀÇ ³ª´°¼ÀÀº " + (a / b));

		scanner.close();
	}

}

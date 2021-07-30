package redo;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dividend, divisor;

		System.out.print("분자를 입력하시오: ");
		dividend = scanner.nextInt();
		System.out.print("분모를 입력하시오: ");
		divisor = scanner.nextInt();

		System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);

		scanner.close();
	}
}

package redo;

import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dividend, divisor;

		while (true) {
			System.out.print("분자를 입력하시오: ");
			dividend = scanner.nextInt();
			System.out.print("분모를 입력하시오: ");
			divisor = scanner.nextInt();

			try {
				System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
			}
		}

		scanner.close();
	}

}

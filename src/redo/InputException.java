package redo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0, n = 0;

		System.out.println("정수 3개를 입력하세요.");

		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1 + ">> ");
			try {
				n = scanner.nextInt();
//				sum += n;
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next();
				i--;
//				n = 0;
				continue;
			}
			sum += n;
		}

		System.out.print("합계: " + sum);

		scanner.close();
	}

}

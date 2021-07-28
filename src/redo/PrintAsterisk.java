package redo;

import java.util.Scanner;

public class PrintAsterisk {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int asterisk;

		System.out.println("정수를 입력하시오>> ");
		asterisk = scanner.nextInt();

		for (int i = asterisk; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
	}
}

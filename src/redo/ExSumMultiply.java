package redo;

import java.util.Scanner;

public class ExSumMultiply {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.print("3자리수 정수 입력(100~999)>>");

		number = scanner.nextInt();

		System.out.println("100의 자리와 10의 자리의 합은 " + ((number / 100) + ((number % 100) / 10)));
		System.out.println("10의 자리와 1의 자리의 곱은 " + (((number % 100) / 10) * (number % 10)));
		
		scanner.close();
	}

}

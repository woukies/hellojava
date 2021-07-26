package redo;

import java.util.Scanner;

public class TaxiFare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int income = 0, fare;

		for (int i = 0; i < 10; i++) {
			System.out.print("요금을 입력하세요: ");
			fare = scanner.nextInt();
			income += fare;
		}

		System.out.println("총 수입: " + income);

		scanner.close();
	}

}

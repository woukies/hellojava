package redo;

import java.util.Scanner;

public class ComputeInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int years = 0;
		double rate, principal, balance;

		System.out.print("원금을 입력하세요: ");
		principal = scanner.nextDouble(); // int
		System.out.print("연이율을 입력하세요: ");
		rate = scanner.nextDouble();

		balance = principal;

		System.out.println("\n연도수\t원리금");
		while (balance <= principal * 2) { // do while
			years++;
			balance *= (1.0 + rate / 100.0);
			System.out.println(years + "\t" + balance);
		}
		System.out.println("\n필요한 연도수 = " + years);

		scanner.close();
	}

}

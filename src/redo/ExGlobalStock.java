package redo;

import java.util.Scanner;

public class ExGlobalStock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int purchaseAmount, saleAmount;
		double transferTax;

		System.out.print("매수 금액을 입력하세요: ");
		purchaseAmount = scanner.nextInt();
		System.out.print("매도 금액을 입력하세요: ");
		saleAmount = scanner.nextInt();

		if (saleAmount > purchaseAmount) {
			transferTax = (saleAmount - purchaseAmount) * 0.22;
		} else {
			transferTax = 0;
		}

		System.out.println("양도세 = " + transferTax);

		scanner.close();
	}

}

package redo;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int purchaseAmount, balance;

		System.out.print("구매 금액을 입력하세요: ");
		purchaseAmount = scanner.nextInt();
		System.out.printf("구매 금액 = %d\n", purchaseAmount);

		if (purchaseAmount >= 300000) {
			balance = purchaseAmount - 30000;
		} else if (purchaseAmount >= 100000) {
			balance = purchaseAmount - 5000;
		} else {
			balance = purchaseAmount;
		}

		System.out.printf("청구 금액 = %d\n", balance);

		scanner.close();
	}
}

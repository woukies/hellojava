package redo;

import java.util.Scanner;

public class ExGlobalStock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int purchaseAmount, saleAmount;
		double transferTax;

		System.out.print("�ż� �ݾ��� �Է��ϼ���: ");
		purchaseAmount = scanner.nextInt();
		System.out.print("�ŵ� �ݾ��� �Է��ϼ���: ");
		saleAmount = scanner.nextInt();

		if (saleAmount > purchaseAmount) {
			transferTax = (saleAmount - purchaseAmount) * 0.22;
		} else {
			transferTax = 0;
		}

		System.out.println("�絵�� = " + transferTax);

		scanner.close();
	}

}

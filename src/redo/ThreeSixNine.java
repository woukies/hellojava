package redo;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber, count = 0;
		int numOf1, numOf10;

		System.out.print("10~99 ������ ������ �Է��Ͻÿ�>>");
		inputNumber = scanner.nextInt();

		numOf1 = inputNumber % 10;
		numOf10 = inputNumber / 10;

		if (numOf1 != 0 && numOf1 % 3 == 0) {
			count++;
		}
		if (numOf10 != 0 && numOf10 % 3 == 0) {
			count++;
		}

		switch (count) {
		case 1:
			System.out.println("�ڼ�¦");
			break;
		case 2:
			System.out.println("�ڼ�¦¦");
			break;
		default:
			System.out.println(inputNumber);
			break;
		}

		scanner.close();

	}

}

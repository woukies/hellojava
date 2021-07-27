package doing;

import java.util.Scanner;

public class Redo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int inputNumber;

		while (true) {
			try {
				System.out.print("반지름 입력: ");
				inputNumber = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner = new Scanner(System.in);
			}
		}

		System.out.printf("> 반지름: %.1f", Math.pow(inputNumber, 2) * Math.PI);

		scanner.close();
	}

}

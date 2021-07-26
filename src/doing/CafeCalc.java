package doing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CafeCalc {

	public static void main(String[] args) {
		int inputNumber = 0;
		int i;
		Scanner inputData = new Scanner(System.in);

		do {
			i = 1;
			try {
				System.out.println("������ �Է�: ");
				inputNumber = inputData.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է��� �ּ���.");
				inputData = new Scanner(System.in);
				inputNumber = 0;
			}
			while (i <= 9 && inputNumber != 0) {
				System.out.printf("%3d * %d = %3d\n", inputNumber, i, inputNumber * i);
				i++;
			}

		} while (inputNumber != 0);

		inputData.close();
		System.out.println("END");
	}
}

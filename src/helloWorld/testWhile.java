package helloWorld;

import java.util.Scanner;

public class testWhile {

	public static void main(String[] args) {

		int num = 0;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("���� �Է�(n < 0):");
			num = scanner.nextInt();
			boolean prime = false;
			for (int i = 2; i <= num; i++) {
				for (int j = 2; j <= i; j++) {
					if (j == i) {
						if (prime) {
							System.out.print(", ");
							prime = false;
						}
						System.out.print(j);
						prime = true;
					} else if (i % j == 0) {
						break;
					}
				}
			}
			System.out.println();
		} while (num > 0);

		System.out.println("����");
		scanner.close();
	}

}

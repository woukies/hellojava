package doing;

import java.util.Scanner;

public class CaseIF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;

		System.out.print("���� �Է�: ");
		age = scanner.nextInt();

		if (age > 15) {
			System.out.println("���� ����! ����");
		} else {
			System.out.println("15�� ����! ����");
		}

		System.out.print("���� �Է�: ");
		age = scanner.nextInt();

		if (age > 0) {
			System.out.printf("%d = ���", age);
		} else if (age < 0) {
			System.out.printf("%d = ����", age);
		} else {
			System.out.printf("%d = 0", age);
		}

		scanner.close();
	}
}

package redo;

import java.util.Scanner;

public class PasswordWhile {

	public static void main(String[] args) {
		final int maxTry = 3;
		Scanner scanner = new Scanner(System.in);

		String input, password = "myongji60";
		int trynumber = 0;

		for (int i = 0; i < maxTry; i++) {
			System.out.println("��ȣ�� �Է��ϼ���: ");
			input = scanner.next();
			trynumber++;

			if (password.equals(input)) {
				System.out.println("ȯ���մϴ�");
				break;
			}
		}
		if(trynumber == 3) {
			System.out.println("������ �ź��մϴ�.");
		}
		
		scanner.close();
	}

}

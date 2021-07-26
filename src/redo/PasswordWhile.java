package redo;

import java.util.Scanner;

public class PasswordWhile {

	public static void main(String[] args) {
		final int maxTry = 3;
		Scanner scanner = new Scanner(System.in);

		String input, password = "myongji60";
		int trynumber = 0;

		for (int i = 0; i < maxTry; i++) {
			System.out.println("암호를 입력하세요: ");
			input = scanner.next();
			trynumber++;

			if (password.equals(input)) {
				System.out.println("환영합니다");
				break;
			}
		}
		if(trynumber == 3) {
			System.out.println("접속을 거부합니다.");
		}
		
		scanner.close();
	}

}

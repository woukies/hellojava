package doing;

import java.util.Scanner;

public class CaseIF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;

		System.out.print("나이 입력: ");
		age = scanner.nextInt();

		if (age > 15) {
			System.out.println("나이 제한! ㅂㅂ");
		} else {
			System.out.println("15세 이하! ㅇㅇ");
		}

		System.out.print("숫자 입력: ");
		age = scanner.nextInt();

		if (age > 0) {
			System.out.printf("%d = 양수", age);
		} else if (age < 0) {
			System.out.printf("%d = 음수", age);
		} else {
			System.out.printf("%d = 0", age);
		}

		scanner.close();
	}
}

package done;

import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
		String[] quiz = { "1 + 1 = ", "1 - 1 = ", "1 * 1 = ", "1 / 1 = ", "1 % 1 = " };
		String[] answer = { "2", "0", "1", "1", "0" };
		Scanner scanner = new Scanner(System.in);
		int score = 0;

		for (int i = 0; i < quiz.length; i++) {
			int q = (int) (Math.random() * quiz.length);
			System.out.print(quiz[q]);

			String s = scanner.next();

			if (answer[q].equals(s)) {
				System.out.println("����!");
				score++;
			} else {
				System.out.println("����~");
			}
		}

		System.out.printf("> ���� ����: %d��\n", score);

		scanner.close();
	}

}

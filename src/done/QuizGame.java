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
				System.out.println("정답!");
				score++;
			} else {
				System.out.println("오답~");
			}
		}

		System.out.printf("> 퀴즈 종료: %d점\n", score);

		scanner.close();
	}

}

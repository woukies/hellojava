package redo;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberToGuess = (int) (Math.random() * 10) + 1;
		int guess = 0;

		while (true) {
			System.out.print("추측한 숫자를 입력하세요>> ");
			guess = scanner.nextInt();

			if (guess == numberToGuess) {
				System.out.println("추측한 숫자가 맞습니다.");
				break;
			}

			System.out.print("추측한 숫자가 틀렸습니다. ");
			if (guess > numberToGuess) {
				System.out.println("너무 큽니다.");
			} else {
				System.out.println("너무 작습니다.");
			}
		}
		
		scanner.close();
	}
}

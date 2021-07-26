package box;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		final int STUDENTS = 5;
		int total = 0;
		Scanner scanner = new Scanner(System.in);

		int[] scores = new int[STUDENTS];
		String[] names = new String[STUDENTS];

		for (int i = 0; i < STUDENTS; i++) {
			System.out.print("성적: ");
			scores[i] = scanner.nextInt();
			System.out.print("이름: ");
			names[i] = scanner.next();
		}

		int max = -1;
		String best = new String();
		int min = 9999;
		String worst = new String();

		for (int i = 0; i < STUDENTS; i++) {
			total += scores[i];
			if (scores[i] >= max) {
				max = scores[i];
				best = names[i];
			}
			if (scores[i] <= min) {
				min = scores[i];
				worst = names[i];
			}
		}

		System.out.println("평균: " + total / STUDENTS);
		System.out.printf("최고: %s(%d)\n", best, max);
		System.out.printf("최저: %s(%d)\n", worst, min);

		System.out.println("> EXIT");
		scanner.close();
	}
	
	
}

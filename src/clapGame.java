import java.util.InputMismatchException;
import java.util.Scanner;

public class clapGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;

		while (true) {
			System.out.print("Input Number(n > 0): ");
			try {
				inputNumber = scanner.nextInt();
			} catch (InputMismatchException e) {
				scanner = new Scanner(System.in);
			}
			if (inputNumber > 0) {
				break;
			}
		}

		for (int i = 1; i <= inputNumber; i++) {
			// Integer.toString(i).contains("3") || Integer.toString(i).contains("6") ||
			// Integer.toString(i).contains("9")
			// i % 3 == 0
			if (Integer.toString(i).matches(".*(3|6|9).*")) {
				System.out.println("¹Ú¼ö");
			} else {
				System.out.println(i);
			}
		}
		
		scanner.close();
	}
}

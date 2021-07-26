package box;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _Snail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sizeRow = 0;
		int sizeColumn = 0;

		do {
			if (sizeRow <= 0) {
				System.out.print("Row(n > 0): ");
				try {
					sizeRow = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Input Integer!");
					scanner = new Scanner(System.in);
				}
			}
			if (sizeColumn <= 0) {
				System.out.print("Column(n > 0): ");
				try {
					sizeColumn = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Input Integer!");
					scanner = new Scanner(System.in);
				}
			}
		} while ((sizeRow <= 0) || (sizeColumn <= 0));

		int[][] snailBox = new int[sizeRow][sizeColumn];
		int snailSize = sizeRow * sizeColumn;

		for (int xy = 0, snailRow = 0, snailColumn = 0, moveR = sizeRow, moveC = sizeColumn,
				snail = 1; snail <= snailSize; snail++) {
			snailBox[snailRow][snailColumn] = snail;
			switch (xy) {
			case 0:
				if (snailColumn == moveC) {
					xy = (xy + 1) % 4;
					moveC--;
					snailRow++;
				} else {
					snailColumn++;
				}
				break;
			case 1:
				if (snailRow == moveR) {
					xy = (xy + 1) % 4;
					moveR--;
					snailColumn--;
				} else {
					snailRow++;
				}
				break;
			case 2:
				if (snailColumn < (sizeColumn - moveC)) {
					xy = (xy + 1) % 4;
					snailRow--;
				} else {
					snailColumn--;
				}
				break;
			case 3:
				if (snailRow < (sizeRow - moveR)) {
					xy = (xy + 1) % 4;
					snailColumn++;
				} else {
					snailRow--;
				}
				break;
			}
		}

		for (int i = 0; i < snailBox.length; i++) {
			for (int j = 0; j < snailBox[i].length; j++) {
				System.out.printf("%d\t", snailBox[i][j]);
			}
			System.out.println();
		}

		System.out.println("> exit");
		scanner.close();
	}

}

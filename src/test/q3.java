package test;

public class q3 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				// j + "*" + i + " = " + (i * j) + ""
				System.out.printf("%d*%d =%2d  ", j, i, j * i);
			}
			System.out.println();
		}
	}
}

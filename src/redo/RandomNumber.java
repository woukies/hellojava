package redo;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int rNumber = 0;
		Random generator = new Random();

		while (rNumber != 7) {
//			rNumber = (int) (Math.random() * 10) + 1;
			rNumber = generator.nextInt(10) + 1;
			System.out.println(rNumber);
		}
	}
}

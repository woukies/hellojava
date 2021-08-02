package redo;

public class RandomTen {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		int sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 10) + 1;
		}

		System.out.print("랜덤한 정수들: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
			sum += intArray[i];
		}
		System.out.println();

		System.out.println("평균은 " + (double) sum / intArray.length);
	}
}

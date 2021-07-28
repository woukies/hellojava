package redo;

public class ReturnArray {
	static int[] makeArray() {
		int[] tempArray = new int[4];

		for (int i = 0; i < tempArray.length; i++) {
			tempArray[i] = i;
		}

		return tempArray;
	}

	public static void main(String[] args) {
		int[] intArray;

		intArray = makeArray();

		for (int i : intArray) {
			System.out.print(i + " ");
		}

	}
}
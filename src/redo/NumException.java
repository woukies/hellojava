package redo;

public class NumException {

	public static void main(String[] args) {
		String[] stringNumber = { "23", "12", "3.141592", "998" };
//		String[] stringNumber = { "23", "12", "998" };

		int i = 0;

		try {
			for (int j; i < stringNumber.length; i++) {
				j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값: " + j);
			}
		} catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
	}
}

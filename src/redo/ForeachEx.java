package redo;

public class ForeachEx {
	enum Week {
		일, 월, 화, 수, 목, 금, 토
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		String[] names = { "사과", "배", "바나나", "체리", "딸기", "포도" };

		int sum = 0;
		for (int n : numbers) {
			System.out.print(n + " ");
			sum += n;
		}

		System.out.println();
		System.out.println("합: " + sum);

		for (String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();

		for (Week w : Week.values()) {
			System.out.print(w + "요일 ");
		}
		System.out.println();

	}

}

package todo;

import static java.lang.Math.*; // 정적 선언

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.StringTokenizer;

public class PackageTest {

	public static void main(String[] args) {
		final int maxSize = 10000;
		final int arraySize = 20;
		final int randomRange = 100;
		int count = 0;

		long startTime = System.nanoTime();

		for (int i = 0; i < maxSize; i++) {
			// 주사위 더블 나올 확률
			if (new Random().nextInt(6) == new Random().nextInt(6)) {
				count++;
			}
		}

		long endTime = System.nanoTime();
		System.out.printf("Chance: %.2f%%, tries: %d(%.2fms)\n", ((double) count) / maxSize * 100, maxSize,
				(double) (endTime - startTime) / (1000 * 1000));

		System.out.println("System 클래스 이름: " + System.class.getName());

		int cubeSize = new Random().nextInt(randomRange);
		System.out.printf("%dcm 정육면체 부피 = %dcm^3\n", cubeSize, (int) pow(cubeSize, 3)); // 정적 선언해서 Math.pow 안써도 됨

		int[] array = new int[arraySize];
		System.out.printf("Array[%d]: ", arraySize);
		for (int i = 0; i < arraySize; i++) {
			array[i] = new Random().nextInt(randomRange);
			System.out.printf("%d ", array[i]);
		}

		System.out.println();

		Arrays.sort(array);
		System.out.printf("Sort: ");
		for (int i = 0; i < arraySize; i++) {
			System.out.printf("%d ", array[i]);
		}

		System.out.println();

		Arrays.fill(array, new Random().nextInt(randomRange));
		System.out.printf("Fill: ");
		for (int i = 0; i < arraySize; i++) {
			System.out.printf("%d ", array[i]);
		}

		System.out.println();

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 SSS");
		System.out.println("> " + dateFormat.format(calendar.getTime()));

		System.out.println();
		calendar.set(2021, 6 - 1, 26);
		int calendarMonth = calendar.get(Calendar.MONTH);

		//// /?/ 요일 맞추려면?

		System.out.println((calendarMonth + 1) + "월");
		for (int i = 0; i < randomRange; i++) { // calendar.get(Calendar.DAY_OF_MONTH)
			calendar.add(Calendar.DATE, 1);
			if (calendarMonth != calendar.get(Calendar.MONTH)) {
				calendarMonth = calendar.get(Calendar.MONTH);
				System.out.println();
				System.out.println();
				System.out.println((calendarMonth + 1) + "월");
				for (int j = 0; j < (i % 7); j++) {
					System.out.printf("    ");
				}
			}
			System.out.printf("%4d", calendar.get(Calendar.DATE));
			if ((i + 1) % 7 == 0) {
				System.out.println();
			}
		}

		System.out.println();
		System.out.println();

		//// /?/ 중복을 제거하려면?

		String[] fruitString = { "사과", "배", "바나나", "자두", "참외", "사과", "사과", "바나나" };
		String[] splitString = new String[fruitString.length];
		Arrays.sort(fruitString);
		for (int i = 0, j = 0; i < fruitString.length - 1; i++) {
			splitString[j] = fruitString[i];
			if (i != 0) {
				if (!splitString[j].equals(fruitString[i - 1])) {
					j++;
				}
			}
		}

		StringTokenizer st = new StringTokenizer(String.join(",", splitString), ",");
		// element = token, 빈칸 무시 (null은 아님)

		while (st.hasMoreTokens()) {
			System.out.println("countTokens() = " + st.countTokens() + ", nextToken() = " + st.nextToken());
		}
	}
}

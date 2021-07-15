package todo;

import static java.lang.Math.*; // ���� ����

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
			// �ֻ��� ���� ���� Ȯ��
			if (new Random().nextInt(6) == new Random().nextInt(6)) {
				count++;
			}
		}

		long endTime = System.nanoTime();
		System.out.printf("Chance: %.2f%%, tries: %d(%.2fms)\n", ((double) count) / maxSize * 100, maxSize,
				(double) (endTime - startTime) / (1000 * 1000));

		System.out.println("System Ŭ���� �̸�: " + System.class.getName());

		int cubeSize = new Random().nextInt(randomRange);
		System.out.printf("%dcm ������ü ���� = %dcm^3\n", cubeSize, (int) pow(cubeSize, 3)); // ���� �����ؼ� Math.pow �Ƚᵵ ��

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
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� a hh�� mm�� ss�� SSS");
		System.out.println("> " + dateFormat.format(calendar.getTime()));

		System.out.println();
		calendar.set(2021, 6 - 1, 26);
		int calendarMonth = calendar.get(Calendar.MONTH);

		//// /?/ ���� ���߷���?

		System.out.println((calendarMonth + 1) + "��");
		for (int i = 0; i < randomRange; i++) { // calendar.get(Calendar.DAY_OF_MONTH)
			calendar.add(Calendar.DATE, 1);
			if (calendarMonth != calendar.get(Calendar.MONTH)) {
				calendarMonth = calendar.get(Calendar.MONTH);
				System.out.println();
				System.out.println();
				System.out.println((calendarMonth + 1) + "��");
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

		//// /?/ �ߺ��� �����Ϸ���?

		String[] fruitString = { "���", "��", "�ٳ���", "�ڵ�", "����", "���", "���", "�ٳ���" };
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
		// element = token, ��ĭ ���� (null�� �ƴ�)

		while (st.hasMoreTokens()) {
			System.out.println("countTokens() = " + st.countTokens() + ", nextToken() = " + st.nextToken());
		}
	}
}

package redo;

public class ArrayParameterEx2 {
	static void printStringArray(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
	}

	static String[] replaceBe(String[] s) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("be")) {
				s[i] = "eat";
			}
		}

		return s;
	}

	public static void main(String[] args) {
		String[] string = { "to", "be", "or", "not", "to", "be" };

		printStringArray(string);
		replaceBe(string);
		printStringArray(string);
	}
}

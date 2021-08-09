package redo;

public class StringEx {
	public static void main(String[] args) {
		String s1 = " C#";
		String s2 = ",C++";

		System.out.println(s1 + " 길이: " + s1.length());
		System.out.println(s1.contains("#"));
		System.out.println(s1.contains("++"));

		s1 = s1.concat(s2);
		System.out.println(s1);

		s1 = s1.trim();
		System.out.println(s1);

		s1 = s1.replace("C#", "Java");
		System.out.println(s1);

		String s[] = s1.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println("s[" + i + "]= " + s[i]);
		}

		s1 = s1.substring(5);
		System.out.println(s1);
		
		char c = s1.charAt(2);
		System.out.println(c);
	}
}

package redo;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		Integer i3 = Integer.valueOf(10);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1 == i3);
		System.out.println(i1.equals(i3));

		System.out.println();

		char c1 = '4', c2 = 'F';
		System.out.println(Character.isDigit(c1) ? "숫자" : "숫자 아님");
		System.out.println(Character.isAlphabetic(c2) ? "영문자" : "영문자 아님");

		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28).toUpperCase());
		System.out.println(Integer.toBinaryString(28));

		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));

		boolean b = 4 > 3;
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
	}
}

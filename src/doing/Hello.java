package doing;

public class Hello {

	public static void main(String[] args) {
		int x = 0x0f;
		
		Calc calc = new Calc();
		System.out.println(calc.sum(1, 2));

		System.out.printf("%x, %d\n", x, x);
		x <<= 0;
		System.out.printf("%x, %d\n", x, x);
		x >>= 1;
		System.out.printf("%x, %d\n", x, x);
	}

}

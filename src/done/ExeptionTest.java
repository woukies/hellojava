package done;

public class ExeptionTest {

	public static void main(String[] args) {
		int[] error = { 0, 1, 2, 3, 4, 5 };
		int randomNumber = (int) (Math.random() * error.length * 2);

		try {
			System.out.println("> try1");
			System.out.println(error[randomNumber]);
			System.out.println("> try2");
			if (randomNumber % 3 == 1) {
				System.out.println("> return");
				return; // return 전에 finally 실행
			}
			multipleThree.print(randomNumber);
		} catch (Error e) {
			e.printStackTrace();
			System.out.println("> return");
			return; // return 전에 finally 실행
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // try-catch 이후 무조건 실행되는 부분 ( PrintWriter.out, Scanner.close )
			System.out.println("> finally");
		}

		System.out.println("> exit");
	}
}

class multipleThreeError extends Error {
	public multipleThreeError() {
		super("3의 배수");
	}

}

class multipleThree {
	public static void print(int n) throws multipleThreeError {
		if (n % 3 == 0) {
			throw new multipleThreeError();
		} else {
			System.out.printf("RandomNumber = %d \n", n);
		}
	}
}
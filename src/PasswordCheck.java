import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		final int MAX_TRY = 3;
		
		Scanner scanner = new Scanner(System.in);

		String input, password = "myongji60";
		int trynumber = 0;

		for (int i = 0; i < MAX_TRY; i++) {
			System.out.print("암호를 입력하세요: ");
			input = scanner.next();
			trynumber++;

			if (password.equals(input)) {
				System.out.println("환영합니다");
				break;
			} else {
				System.out.println("암호가 틀립니다");
			}
		}
		
		if(trynumber == MAX_TRY) {
			System.out.println("접속을 거부합니다");
		}
		
		scanner.close();
	}

}

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		final int MAX_TRY = 3;
		
		Scanner scanner = new Scanner(System.in);

		String input, password = "myongji60";
		int trynumber = 0;

		for (int i = 0; i < MAX_TRY; i++) {
			System.out.print("��ȣ�� �Է��ϼ���: ");
			input = scanner.next();
			trynumber++;

			if (password.equals(input)) {
				System.out.println("ȯ���մϴ�");
				break;
			} else {
				System.out.println("��ȣ�� Ʋ���ϴ�");
			}
		}
		
		if(trynumber == MAX_TRY) {
			System.out.println("������ �ź��մϴ�");
		}
		
		scanner.close();
	}

}

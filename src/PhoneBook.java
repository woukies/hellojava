import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

public class PhoneBook {
	private Scanner scanner;
	private Phone[] pBook;

	public PhoneBook() {
		scanner = new Scanner(System.in);
	}

	void read() {
		System.out.print("인원수>> ");
		int n = scanner.nextInt();
		pBook = new Phone[n];

		for (int i = 0; i < pBook.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			pBook[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}

	String search(String name) {
		for (Phone p : pBook) {
			if (p.getName().equals(name)) {
				return p.getTel();
			}
		}
		return null;
	}

	void run() {
		read();

		while (true) {
			System.out.print("검색할 이름>> ");
			String name = scanner.next();
			if (name.equals("그만")) {
				break;
			}

			String tel = search(name);
			if (tel != null) {
				System.out.println(name + "의 번호는 " + tel + "입니다.");
			} else {
				System.out.println(name + "이 없습니다.");
			}
		}
		
		scanner.close();
	}

	public static void main(String[] args) {
		new PhoneBook().run();
	}
}

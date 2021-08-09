package redo;

import java.util.Scanner;

class Person2 {
	String lastName;
	String FirstName;

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public int getLengh() {
		return lastName.length() + FirstName.length();
	}

}

public class PersonDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person2[] person = new Person2[2];
		String fname, lname;

		for (int i = 0; i < person.length; i++) {
			System.out.print("성을 입력하세요: ");
			lname = scanner.next();
			System.out.print("이름을 입력하세요: ");
			fname = scanner.next();

			person[i] = new Person2();
			person[i].FirstName = fname;
			person[i].lastName = lname;
			System.out.print("성:" + person[i].getLastName());
			System.out.print(" 이름: " + person[i].getFirstName());
			System.out.println(" 성명의 길이: " + person[i].getLengh());
		}

		scanner.close();
	}
}

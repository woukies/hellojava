package redo;

class PersonA {
	String name;
	String id;

	public PersonA(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("Person");
	}
}

class StudentA extends PersonA {
	String grade;
	String department;

	public StudentA(String name) {
		super(name);
	}
	
	public void print() {
		System.out.println("Student");
	}
}

public class UpcastingEx {

	public static void main(String[] args) {
		/* 업캐스팅 */
		PersonA p;
		StudentA s = new StudentA("자바");
		s.grade = "A";
		s.id = "java";

		p = s;
		System.out.println(p.name);
		System.out.println(p.id);
		// System.out.println(p.grade); //error
		

		/* 다운캐스팅 */
		PersonA p2 = new StudentA("여름");
		StudentA s2 = (StudentA) p2;
		
		System.out.println(s2.name);
		s2.grade = "A";
		
		// instanceof 객체만
		p.print(); 
		System.out.println(p instanceof StudentA);
		s.print();
		System.out.println(s instanceof StudentA);
		p2.print();
		System.out.println(p2 instanceof StudentA);
		s2.print();
		System.out.println(s2 instanceof StudentA);
		
		PersonA p3 = new PersonA("겨울");
		p3.print();
		System.out.println(p3 instanceof StudentA);
		
		
	}
}

package redo;

import redoPLUS.*;

public class AnimalMain {
	public static void main(String[] args) {
		// Animal a = new Animal(); // 추상 클래스라 불가능
		Penguin p = new Penguin();
		p.swim();

		Bird p2 = new Penguin(); // 업캐스팅
		p2.walk();
		// p2.swim(); // 업캐스팅된 객체라서 super 클래스의 메소드만 사용 가능

		Penguin p3 = (Penguin) p2; // 다운캐스팅
		p3.swim(); // 다운캐스팅은 sub 클래스도 사용 가능

		Duck d = new Duck();
		d.swim();
		d.fly();
		Bird d2 = new Duck();
		d2.eat();
		Duck d3 = (Duck) d2;
		d3.fly();

		// new Swim(); // 인터페이스는 객체 생성 불가능
		Swim[] s = new Swim[2]; // 단, 인터페이스/추상 클래스 타입의 레퍼런스 변수 가능
		s[0] = new Penguin();
		s[1] = new Duck();
		s[0].swim();
		s[1].swim();
		Swim s2 = new Penguin();
		s2.swim();

		Bird[] b = new Bird[2];
		b[0] = new Penguin();
		System.out.println(b[0].life);
		b[0].eat();
	}
}

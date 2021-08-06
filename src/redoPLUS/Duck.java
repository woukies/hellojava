package redoPLUS;

public class Duck extends Bird implements Swim, Fly {
	@Override
	public void swim() {
		System.out.println("오리 수영");
	}

	@Override
	public void fly() {
		System.out.println("오리 날기");
	}
}

package redoPLUS;

public class Penguin extends Bird implements Swim {
	@Override
	public void swim() {
		System.out.println("펭귄 수영");
	}
}

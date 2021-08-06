package redoPLUS;

abstract public class Bird extends Animal {
	public int wing = 2;

	public void walk() {
		System.out.println("걷기");
	}

	public void eat() {
		System.out.println("먹기");
	}
}

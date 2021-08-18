package redo;

public class TestRunnable {
	public static void main(String[] args) {
		Thread t = new Thread(new TimerRunnable());
		t.start();
	}
}

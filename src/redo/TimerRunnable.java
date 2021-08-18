package redo;

public class TimerRunnable implements Runnable {
	int n = 0;

	@Override
	public void run() {
		while (true) {
			System.out.println(n++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				return;
			}
		}
	}
}

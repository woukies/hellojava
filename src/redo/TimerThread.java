package redo;

public class TimerThread extends Thread {
	int n = 0;

	@Override
	public void run() {
		while (true) {
			System.out.println(n++);
			try {
				sleep(1000);
			} catch (Exception e) {
				return;
			}
		}
	}
}
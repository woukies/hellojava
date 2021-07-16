package doing;

import javax.swing.*;
import java.awt.*;

public class CarGame extends JFrame {
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	int x1 = 0, x2 = 0, x3 = 0;
	private int size = 40;

	class MyThread extends Thread {
		public void run() {
			for (int i = 0; i < 200; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				x1 += (int) (Math.random() * 10) * ((Math.random() > 0.8) ? -1 : 1);
				label1.setBounds(x1, 0, size, size);
				x2 += (int) (Math.random() * 10) * ((Math.random() > 0.8) ? -1 : 1);
				label2.setBounds(x2, 50, size, size);
				x3 += (int) (Math.random() * 10) * ((Math.random() > 0.8) ? -1 : 1);
				label3.setBounds(x3, 100, size, size);
			}
		}
	}

	public CarGame() {
		setTitle("CarRace");
		setSize(600, 200);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		label1 = new JLabel();
		label1.setIcon(new ImageIcon("./res/lion.png"));
		label2 = new JLabel();
		label2.setIcon(new ImageIcon("./res/tiger.png"));
		label3 = new JLabel();
		label3.setIcon(new ImageIcon("./res/dog.png"));
		add(label1);
		add(label2);
		add(label3);
		label1.setBounds(0, 0, size, size);
		label2.setBounds(0, 50, size, size);
		label3.setBounds(0, 100, size, size);
		(new MyThread()).start();
		setVisible(true);
	}

	public static void main(String[] args) {
		CarGame t = new CarGame();
	}
}
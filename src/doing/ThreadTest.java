package doing;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadTest {

	public static void main(String[] args) {

		// FirstThread
		/*
		 * for (int i = 0; i < (int) (Math.random() * 10); i++) { new
		 * FirstThread(Integer.toString((int) (Math.random() * 10))).start(); }
		 * 
		 * System.out.println("> exit");
		 */

		// SecondThread
		// new CountDownFrame();

		// ThirdThread
		/*
		 * CakeBuffer buffer = new CakeBuffer(); (new Thread(new
		 * ProducerThread(buffer))).start(); (new Thread(new
		 * ConsumerThread(buffer))).start();
		 */

		// ForthThread
		MoneyBuffer buffer = new MoneyBuffer();
		(new Thread(new BankThread(buffer))).start();
		(new Thread(new CustomerThread(buffer))).start();

	}

}

/////////////////////////////////////////////////////////////////
class FirstThread extends Thread {
	int n;
	String c;
	private int sleepMilliSeconds = 1000;

	public FirstThread() {
		this.n = 1;
	}

	public FirstThread(int n) {
		this.n = n;
	}

	public FirstThread(String c) {
		this.c = c;
		this.n = 0;
	}

	public void run() {
		System.out.println("> Run Thread(" + ((n == 0) ? c : n) + ")");
		for (int i = 0; i < 10; i++) {
			System.out.print(((n == 0) ? c + i : n * i) + " ");
			try {
				Thread.sleep(sleepMilliSeconds);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("> Exit Thread(" + ((n == 0) ? c : n) + ")");
	}
}

/////////////////////////////////////////////////////////////////
class CountDownFrame extends JFrame implements ActionListener {
	private JLabel label;
	private JPanel panel;
	private TextField textField;
	private JButton buttonStart, buttonCancel;

	private SecondThread thread;

	private int count = 10;

	class SecondThread extends Thread {
		public void run() {
			for (int i = count; i >= 0; i--) {
				label.setText(Integer.toString(i));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// e.printStackTrace();
					label.setText("중지");
					return;
				}
			}
			label.setText("종료");
		}
	}

	public CountDownFrame() {
		setTitle("CountDown");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		textField = new TextField(10);
		textField.addActionListener(this);
		panel.add(textField);
		buttonStart = new JButton("Start");
		buttonStart.addActionListener(this);
		buttonStart.setFocusPainted(false);
		panel.add(buttonStart);
		buttonCancel = new JButton("Cancel");
		buttonCancel.addActionListener(this);
		buttonCancel.setFocusPainted(false);
		panel.add(buttonCancel);
		add(panel, BorderLayout.NORTH);

		label = new JLabel("...");
		label.setFont(new Font("D2Coding", Font.BOLD, 100));
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, BorderLayout.CENTER);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonStart || e.getSource() == textField) {
			String inputString = textField.getText();
			try {
				this.count = Integer.parseInt(inputString);
			} catch (NumberFormatException exception) {
				textField.setBackground(new Color(255, 220, 220));
				label.setText(inputString.length() > 0 ? "숫자" : "입력");
				return;
			}
			if (count <= 0) {
				textField.setBackground(new Color(255, 220, 220));
				label.setText("범위");
			} else {
				textField.setBackground(Color.WHITE);
				// label.setText("시작");
				if (thread != null) {
					thread.interrupt();
				}
				thread = new SecondThread();
				thread.start();
			}
		}

		if (e.getSource() == buttonCancel) {
			if (thread != null) {
				thread.interrupt();
			}
		}
	}
}

/////////////////////////////////////////////////////////////////
//// /?/ 버퍼 배열로 빵 여러개 생산하면서 소비하기
class CakeBuffer {
	private int data;
	private boolean empty = true;

	public synchronized int get() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true;
		notifyAll();
		return data;
	}

	public synchronized void put(int data) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = false;
		this.data = data;
		notifyAll();
	}
}

class ProducerThread implements Runnable {
	private CakeBuffer buffer;

	public ProducerThread(CakeBuffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			buffer.put(i);
			System.out.println("생산자: " + i + "번 케익을 생산하였습니다.");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}
		}
	}
}

class ConsumerThread implements Runnable {
	private CakeBuffer buffer;

	public ConsumerThread(CakeBuffer drop) {
		this.buffer = drop;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			int data = buffer.get();
			System.out.println("소비자: " + data + "번 케익을 소비하였습니다.");
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}

/////////////////////////////////////////////////////////////////
class MoneyBuffer {
	private int money;

	public synchronized int get(int n) {
		while ((money - n) < 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		money -= n;
		notifyAll();
		return money;
	}

	public synchronized void put(int n) {
		money += n;
		notifyAll();
	}

	public int account() {
		// notifyAll();
		return money;
	}
}

class BankThread implements Runnable {
	private MoneyBuffer buffer;

	public BankThread(MoneyBuffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0, money = 0; i < 20; i++) {
			money = (int) (Math.random() * 10);
			System.out.printf("고객: %d원 출금 시도\n", money);
			buffer.get(money);
			System.out.printf("고객: %d원 출금, 잔액: %3d(-%d)\n", money, buffer.account(), money);
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}
		}
		System.out.println("고객: 출금 종료");
	}
}

class CustomerThread implements Runnable {
	private MoneyBuffer buffer;

	public CustomerThread(MoneyBuffer drop) {
		this.buffer = drop;
	}

	public void run() {
		for (int i = 0, money = 0; i < 20; i++) {
			money = (int) (Math.random() * 10);
			System.out.printf("은행: %d원 입금 시도\n", money);
			buffer.put(money);
			System.out.printf("은행: %d원 입금, 잔액: %3d(+%d)\n", money, buffer.account(), money);
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}
		}
		System.out.printf("은행: %d원 입금 시도\n", 1000);
		buffer.put(1000);
		System.out.printf("은행: %d원 입금, 잔액: %3d(+%d)\n", 1000, buffer.account(), 1000);
		System.out.println("은행: 입금 종료");
	}
}
package chapter16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComponentNumberEvent {

	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}

}

class MyPanel2 extends JPanel implements ActionListener {
	final int buttonOfNumbers = 10;
	private JButton[] button = new JButton[buttonOfNumbers];

	public MyPanel2() {
		setLayout(new GridLayout(0, 3));
		for (int i = 0; i < buttonOfNumbers; i++) {
			String num = Integer.toString(i + 1);
			button[i] = new JButton(num);
			add(button[i]);
			button[i].addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < buttonOfNumbers; i++) {
			if (e.getSource() == button[i]) {
				System.out.println("> Button" + i + " clicked");
			}
		}
	}
}

class MyFrame2 extends JFrame {
	public MyFrame2() {
		this.setSize(300, 300);
		this.setTitle("Button Number");
		this.add(new MyPanel2());
		this.setVisible(true);
	}
}
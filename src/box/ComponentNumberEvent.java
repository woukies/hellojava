package box;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComponentNumberEvent {

	public static void main(String[] args) {
		MyFrameNumberEvent f = new MyFrameNumberEvent();
	}

}

class MyPanelNumberEvent extends JPanel implements ActionListener {
	final int buttonOfNumbers = 10;
	private JButton[] button = new JButton[buttonOfNumbers];

	public MyPanelNumberEvent() {
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

class MyFrameNumberEvent extends JFrame {
	public MyFrameNumberEvent() {
		this.setSize(300, 300);
		this.setTitle("Button Number");
		this.add(new MyPanelNumberEvent());
		this.setVisible(true);
	}
}
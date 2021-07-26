package doing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComponentNumberEvent {

	public static void main(String[] args) {
		new ComponentNumberFrame();
	}

}

class ComponentNumberPanel extends JPanel implements ActionListener {
	final int buttonOfNumbers = 10;
	private JButton[] button = new JButton[buttonOfNumbers];

	public ComponentNumberPanel() {
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

class ComponentNumberFrame extends JFrame {
	public ComponentNumberFrame() {
		this.setSize(300, 300);
		this.setTitle("Button Number");
		this.add(new ComponentNumberPanel());
		this.setVisible(true);
	}
}
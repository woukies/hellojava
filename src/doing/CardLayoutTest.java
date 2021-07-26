package doing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutTest {
	public static void main(String args[]) {
		CardLayoutFrame f = new CardLayoutFrame();
	}
}

class CardLayoutFrame extends JFrame implements ActionListener {
	JPanel panel;
	Cards cards;

	public CardLayoutFrame() {
		setTitle("CardLayoutTest");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 5, 2, 2));
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("����", panel);
		add(panel, "South");
		cards = new Cards();
		add(cards, "Center");
		setVisible(true);
	}

	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}

	private class Cards extends JPanel {
		CardLayout layout;

		public Cards() {
			layout = new CardLayout(2, 2);
			setLayout(layout);
			for (int i = 1; i <= 10; i++) {
				add(new JButton("���� ī���� ��ȣ�� " + i + "�Դϴ�"), "Center");
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("����")) {
			System.exit(0);
		} else if (e.getActionCommand().equals("<<")) {
			cards.layout.first(cards);
		} else if (e.getActionCommand().equals("<")) {
			cards.layout.previous(cards);
		} else if (e.getActionCommand().equals(">")) {
			cards.layout.next(cards);
		} else if (e.getActionCommand().equals(">>")) {
			cards.layout.last(cards);
		}
	}
}
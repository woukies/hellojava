package done;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuestBook {

	public static void main(String[] args) {
		new ArrayFrame();
	}

}

class MyFrame extends JFrame implements ActionListener {
	JButton ok;
	JLabel sum;
	JLabel[] letters;
	JTextField textField;
	private final int SIZE = 100;
	int count = 0;
	JPanel p2;

	public MyFrame() {
		setTitle("방명록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 800);

		JLabel l1 = new JLabel("내용: ");
		textField = new JTextField(15);
		textField.addActionListener(this);
		ok = new JButton("OK");
		ok.addActionListener(this);
		sum = new JLabel("0명");

		JPanel p1 = new JPanel();
		p2 = new JPanel();

		p2.setLayout(new GridLayout(0, 5, 2, 2));

		p1.add(l1);
		p1.add(textField);
		p1.add(ok);
		p1.add(sum);

		add(p1, BorderLayout.NORTH);

		add(p2, BorderLayout.CENTER);

		letters = new JLabel[SIZE];

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok || e.getSource() == textField) { // 엔터도 되네..
			if (count >= SIZE) {
				return;
			}
			letters[count] = new JLabel(textField.getText());
			p2.add(letters[count++]);
			sum.setText(count + "명");
		}
	}
}
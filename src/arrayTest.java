import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class arrayTest {

	final static int sizeMAX = 40;

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}

class MyFrame extends JFrame implements ActionListener {
	JPanel panel1, panel2;
	JLabel label;
	JButton button;
	JLabel[] labels;
	int index = 0;
	String[] string = { "¸¼À½", "ºñ", "Èå¸²", "´«" };

	MyFrame() {
		setTitle("¶óº§");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);

		panel1 = new JPanel();
		label = new JLabel("¶óº§");
		button = new JButton("¹öÆ°");
		button.addActionListener(this);
		panel1.add(label);
		panel1.add(button);
		panel1.setBackground(Color.GRAY);
		add(panel1, BorderLayout.NORTH);

		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(0, 4, 2, 2));

		labels = new JLabel[arrayTest.sizeMAX];
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(Integer.toString(i));
			panel2.add(labels[i]);
		}

		add(panel2, BorderLayout.CENTER);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println(index);
			labels[(index % labels.length)].setText(string[(int) ((index / labels.length) % string.length)]);
			index++;
		}

	}
}

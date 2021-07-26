package done;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class FrameTest {

	public static void main(String[] args) {
		MyFrameTest frame = new MyFrameTest();
	}

}

class MyFrameTest extends JFrame {
	private MyPanelTest panel1;

	public MyFrameTest() {
		// setTitle("Title");
		super("Title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1500, 800);

		panel1 = new MyPanelTest();
		add(panel1);

		setVisible(true);
	}
}

class MyPanelTest extends JPanel implements ActionListener {
	private int countButton = 0;
	private JButton colorButton, numberButton;
	public JButton addButton;
	private JButton[] button = new JButton[200];
	private JPanel centerPanel, northPanel;

	public MyPanelTest() {
		setLayout(new BorderLayout());

		northPanel = new JPanel();

		colorButton = new JButton("Random Color");
		colorButton.setFocusPainted(false);
		colorButton.addActionListener(this);

		numberButton = new JButton("Change Number");
		numberButton.setFocusPainted(false);
		numberButton.addActionListener(this);

		addButton = new JButton("Add Button");
		addButton.setFocusPainted(false);
		addButton.addActionListener(this);

		northPanel.add(colorButton);
		northPanel.add(numberButton);
		northPanel.add(addButton);
		add(northPanel, BorderLayout.NORTH);

		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(0, 20, 2, 2));
		for (int i = 0; i < button.length; i++) { // button.length
			button[i] = new JButton(Integer.toString((int) (Math.random() * 100)));
			centerPanel.add(button[i]);
		}
		add(centerPanel, BorderLayout.CENTER);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == colorButton) {
			for (JButton b : button) {
				b.setBackground(new Color((int) (Math.random() * 255), (int) (Math.random() * 255),
						(int) (Math.random() * 255)));
			}
			System.out.println("Count: " + ++countButton);
		}
		if (e.getSource() == numberButton) {
			for (JButton b : button) {
				b.setText(Integer.toString((int) (Math.random() * 100)));
				if (Integer.parseInt(b.getText()) % 2 == 0) {
					b.setBackground(Color.BLACK);
				} else {
					b.setBackground(Color.WHITE);
				}
			}
		}
		if (e.getSource().equals(addButton)) {
			button = Arrays.copyOf(button, button.length + 1);
			button[button.length - 1] = new JButton("New");
			centerPanel.add(button[button.length - 1]);
			super.validate();
			super.repaint();
		}

	}
}
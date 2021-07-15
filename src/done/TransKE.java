package done;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.*;

public class TransKE {

	public static void main(String[] args) {
		new TransFrame();
	}

}

class TransFrame extends JFrame implements ActionListener, KeyListener {
	final String[] wordEnglish = { "apple", "banana", "chocolate", "dragon" };
	final String[] wordKorean = { "사과", "바나나", "초콜릿", "용" };
	boolean validWord = false;

	JPanel textFieldPanel, textAreaPanel, buttonPanel;
	JTextField inputField, outputField;
	JTextArea inputArea, outputArea;
	JButton okayButton, cancleButton;

	public TransFrame() {
		setTitle("단어 변환기"); // super("단어 변환기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		textFieldPanel = new JPanel();
		inputField = new JTextField(10);
		inputField.addKeyListener(this);
		outputField = new JTextField(10);
		outputField.setBackground(new Color(240, 240, 240));
		outputField.setEditable(false);
		textFieldPanel.add(inputField);
		textFieldPanel.add(outputField);

		textAreaPanel = new JPanel();
		inputArea = new JTextArea(5, 10);
		outputArea = new JTextArea(5, 10);
		outputArea.setBackground(new Color(240, 240, 240));
		outputArea.setEditable(false);
		textAreaPanel.add(inputArea);
		textAreaPanel.add(outputArea);

		buttonPanel = new JPanel();

		okayButton = new JButton("확인");
		okayButton.addActionListener(this);
		cancleButton = new JButton("취소");
		cancleButton.addActionListener(this);
		buttonPanel.add(okayButton);
		buttonPanel.add(cancleButton);

		add(textFieldPanel, BorderLayout.NORTH);
		add(textAreaPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == okayButton) {
			outputField.setText("");
			outputArea.setText("");

			for (int i = 0; i < wordKorean.length; i++) {
				if (wordKorean[i].equals(inputField.getText())) {
					outputField.setText(wordEnglish[i]);
					validWord = true;
				}
			}
			if (!validWord) {
				outputField.setText("unknown word!");
			} else {
				validWord = false;
			}

			Scanner scanner = new Scanner(inputArea.getText());
			while (scanner.hasNext()) {
				String s = scanner.next();
				for (int i = 0; i < wordKorean.length; i++) {
					if (wordKorean[i].equals(s)) {
						outputArea.append(wordEnglish[i]);
						outputArea.append("\n");
						validWord = true;
					}
				}
				if (!validWord) {
					outputArea.append("unknown word!");
					outputArea.append("\n");
				} else {
					validWord = false;
				}
			}
		}

		if (e.getSource() == cancleButton) {
			outputField.setText("");
			outputArea.setText("");
		}

	}

	@Override
	public void keyTyped(KeyEvent e) { // 입력 이후
	}

	@Override
	public void keyPressed(KeyEvent e) { // 누르는 순간
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_ENTER) {
			for (int i = 0; i < wordKorean.length; i++) {
				if (wordKorean[i].equals(inputField.getText())) {
					outputField.setText(wordEnglish[i]);
					validWord = true;
				}
			}
			if (!validWord) {
				outputField.setText("unknown word!");
			} else {
				validWord = false;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) { // 떼는 순간
	}
}
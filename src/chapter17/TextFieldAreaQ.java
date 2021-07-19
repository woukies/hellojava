package chapter17;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.event.*;
import java.text.ParseException;
import java.awt.*;

public class TextFieldAreaQ {

	public static void main(String[] args) throws Exception {
		// 날짜 입력 포맷 텍스트 필드
		// 금액 익렵 텍스트 영역
		// -> 버튼 누르면 3년 뒤 예금 이자 출력(연리 1.5%)

		new BankFrame();
	}

}

class DatePanel extends JPanel {
	private JFormattedTextField date;

	public DatePanel() throws ParseException {
		setLayout(new GridLayout(0, 2, 2, 2));
		add(new JLabel("Date: "));
		MaskFormatter mf = new MaskFormatter("####/##/##");
		mf.setPlaceholder("_");
		date = new JFormattedTextField(mf);
		add(date);
	}

	public String toString() {
		return date.toString();
	}
}

class MoneyPanel extends JPanel implements ActionListener {
	private JTextField money;
	private int moneyValue;

	public MoneyPanel() {
		setLayout(new GridLayout(0, 2, 2, 2));
		add(new JLabel("Money: "));
		money = new JTextField();
		money.addActionListener(this);
		add(money);
	}

	public String toString() {
		return money.toString();
	}

	public int getMoneyValue() {
		return moneyValue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == money) {
			moneyValue = Integer.parseInt(money.getText());
		}
	}
}

class ResultPanel extends JPanel {
	public JTextArea result;

	public ResultPanel() {
		result = new JTextArea();
		add(result);
	}
}

class BankFrame extends JFrame implements ActionListener {
	// private JFrame bankFrame;
	private DatePanel datePanel;
	private MoneyPanel moneyPanel;
	private ResultPanel interestPanel;

	public BankFrame() throws Exception {
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		datePanel = new DatePanel();
		// datePanel.addActionListener(this);
		moneyPanel = new MoneyPanel();
		// moneyPanel.addActionListener(this);
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(2, 0, 2, 2));
		inputPanel.add(datePanel);
		inputPanel.add(moneyPanel);
		add(inputPanel, BorderLayout.NORTH);
		interestPanel = new ResultPanel();
		add(interestPanel, BorderLayout.CENTER);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(moneyPanel.getMoneyValue());
	}
}
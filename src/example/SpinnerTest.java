package example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;

public class SpinnerTest extends JFrame implements ActionListener {
	JButton button;
	JSpinner spinner;
	JPanel panel, panelS;
	JLabel label;

	public SpinnerTest() {
		setTitle("���ǳ� �׽�Ʈ");
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		// List Model �׽�Ʈ
		String[] items = { "�Ҽ�", "����", "��������", "���" };
		SpinnerListModel listModel = new SpinnerListModel(items);
		spinner = new JSpinner(listModel);
		panel.add(spinner);

		// Number Model �׽�Ʈ
		SpinnerModel numberModel = new SpinnerNumberModel(1, 0, 100, 4);
		spinner = new JSpinner(numberModel);
		panel.add(spinner);

		// Date Model �׽�Ʈ
		Calendar calendar = Calendar.getInstance();
		Date value = calendar.getTime(); // ���� ��¥
		calendar.add(Calendar.YEAR, -50); // ���簪���� -50�� ����
		Date start = calendar.getTime();
		calendar.add(Calendar.YEAR, 100); // ���� +50�ϸ� ���� ��¥�� ��
		Date end = calendar.getTime();
		SpinnerDateModel dateModel = new SpinnerDateModel(value, start, end, Calendar.YEAR);
		spinner = new JSpinner(dateModel);
		// ��¥�� ������ �� �ִ� �����⸦ �����Ѵ�.
		spinner.setEditor(new JSpinner.DateEditor(spinner, "yyyy�� MM�� dd��"));
		panel.add(spinner);

		button = new JButton("��¥ ���");
		button.addActionListener(this);
		panel.add(button);

		add(panel, BorderLayout.CENTER);

		panelS = new JPanel();
		label = new JLabel();
		panelS.add(label);

		add(panelS, BorderLayout.SOUTH);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy�� MM�� dd���� �����Ͽ����ϴ�.");
			label.setText(formatDate.format(spinner.getValue()));
		}

	}

	public static void main(String[] args) {
		new SpinnerTest();
	}
}

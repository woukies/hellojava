package example;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SpinnerTest extends JFrame {

	public SpinnerTest() {
		setTitle("���ǳ� �׽�Ʈ");
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JSpinner spinner;

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
		SpinnerDateModel dateModel = new SpinnerDateModel(value, start, end,
				Calendar.YEAR);
		spinner = new JSpinner(dateModel);
		// ��¥�� ������ �� �ִ� �����⸦ �����Ѵ�.
		spinner.setEditor(new JSpinner.DateEditor(spinner, "yyyy�� MM�� dd��"));
		panel.add(spinner);
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SpinnerTest();
	}
}

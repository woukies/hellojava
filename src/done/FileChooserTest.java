package done;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FileChooserTest extends JFrame implements ActionListener {
	JButton openButton, saveButton;
	JFileChooser fc;
	JLabel textLabel, paintLabel;
	JPanel panelNorth, panelCenter;

	public FileChooserTest() {
		setTitle("���� ���ñ� �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		fc = new JFileChooser();

		textLabel = new JLabel("���� ���ñ� ������Ʈ �׽�Ʈ�Դϴ�.");
		openButton = new JButton("���� ����");
		openButton.addActionListener(this);

		saveButton = new JButton("���� ����");
		saveButton.addActionListener(this);

		panelNorth = new JPanel();
		panelNorth.add(textLabel);
		panelNorth.add(openButton);
		panelNorth.add(saveButton);
		add(panelNorth, BorderLayout.NORTH);
		panelNorth.setPreferredSize(new Dimension(20, 60));

		paintLabel = new JLabel();

		add(paintLabel, BorderLayout.CENTER);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		// ������ ���¡���ư�� ���� �׼� �̺�Ʈ ó��
		if (e.getSource() == openButton) {
			fc.setCurrentDirectory(new File("D:\\springframework\\hello-world\\res"));
			int returnVal = fc.showOpenDialog(this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				// ���� ������ �����Ѵ�.
				File selectedFile = fc.getSelectedFile();
				paintLabel.setIcon(new ImageIcon(selectedFile.getPath()));
			} else {
				// ����� ���
			}

			// ������ ���塱��ư�� ���� �׼� �̺�Ʈ ó��
		} else if (e.getSource() == saveButton) {
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				// ���� ���Ͽ� �����Ѵ�.
				File selectedFile = fc.getSelectedFile();
				System.out.println(selectedFile.getName());
			} else {
				// ����� ���
			}
		}
	}

	public static void main(String[] args) {
		FileChooserTest frame = new FileChooserTest();
	}
}

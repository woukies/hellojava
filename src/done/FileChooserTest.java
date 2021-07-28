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
		setTitle("파일 선택기 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		fc = new JFileChooser();

		textLabel = new JLabel("파일 선택기 컴포넌트 테스트입니다.");
		openButton = new JButton("파일 오픈");
		openButton.addActionListener(this);

		saveButton = new JButton("파일 저장");
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

		// “파일 오픈”버튼에 대한 액션 이벤트 처리
		if (e.getSource() == openButton) {
			fc.setCurrentDirectory(new File("D:\\springframework\\hello-world\\res"));
			int returnVal = fc.showOpenDialog(this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				// 실제 파일을 오픈한다.
				File selectedFile = fc.getSelectedFile();
				paintLabel.setIcon(new ImageIcon(selectedFile.getPath()));
			} else {
				// 사용자 취소
			}

			// “파일 저장”버튼에 대한 액션 이벤트 처리
		} else if (e.getSource() == saveButton) {
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				// 실제 파일에 저장한다.
				File selectedFile = fc.getSelectedFile();
				System.out.println(selectedFile.getName());
			} else {
				// 사용자 취소
			}
		}
	}

	public static void main(String[] args) {
		FileChooserTest frame = new FileChooserTest();
	}
}

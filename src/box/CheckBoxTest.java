package box;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxTest extends JPanel implements ItemListener {
	
	String[] fruits = { "apple", "grape", "orange", "cherry", "banana" };
	
	JCheckBox[] buttons = new JCheckBox[fruits.length];
	
	JLabel[] pictureLabel = new JLabel[fruits.length];
	ImageIcon[] icon = new ImageIcon[fruits.length];

	public CheckBoxTest() {

		// static, fruits.length
		super(new GridLayout(0, 6));

		// 체크 박스 생성
		for (int i = 0; i < fruits.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
			buttons[i].addItemListener(this);
			pictureLabel[i] = new JLabel(fruits[i]);
			icon[i] = new ImageIcon("./res/" + fruits[i] + ".png");

		}

		JPanel checkPanel = new JPanel(new GridLayout(0, 1));
		for (int i = 0; i < fruits.length; i++)
			checkPanel.add(buttons[i]);

		add(checkPanel);
		for (int i = 0; i < fruits.length; i++) {
			add(this.pictureLabel[i]);
		}
	}

	/** 체크 박스의 아이템 이벤트를 처리한다. */
	public void itemStateChanged(ItemEvent e) {

		ImageIcon image = null;

		Object source = e.getItemSelectable();
		for (int i = 0; i < fruits.length; i++) {
			if (source == buttons[i]) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					pictureLabel[i].setIcon(null);
					pictureLabel[i].setText(fruits[i]);
				} else {
					pictureLabel[i].setIcon(icon[i]);
					pictureLabel[i].setText("");
				}
			}
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent newContentPane = new CheckBoxTest();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}
}
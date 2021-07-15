package done;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.Applet;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderTest extends JFrame implements ChangeListener {
	static final int INIT_VALUE = 15;
	private JSlider slider1, slider2;
	private JButton button;

	public SliderTest() {
		JPanel panel;

		setTitle("�����̴� �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 800);

		panel = new JPanel();
		JLabel label = new JLabel("�����̴��� ������������", JLabel.CENTER);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(label);

		slider1 = new JSlider(0, 50, INIT_VALUE);
		slider1.setMajorTickSpacing(10); // ū ���� ����
		slider1.setMinorTickSpacing(1); // ���� ���� ����
		slider1.setPaintTicks(true); // ������ ǥ���Ѵ�.
		slider1.setPaintLabels(true); // ���� ���̺�� ǥ���Ѵ�.
		slider1.addChangeListener(this); // �̺�Ʈ �����ʸ� ���δ�.
		panel.add(slider1);

		slider2 = new JSlider(0, 50, INIT_VALUE);
		slider2.setMajorTickSpacing(10); // ū ���� ����
		slider2.setMinorTickSpacing(1); // ���� ���� ����
		slider2.setPaintTicks(true); // ������ ǥ���Ѵ�.
		slider2.setPaintLabels(true); // ���� ���̺�� ǥ���Ѵ�.
		slider2.addChangeListener(this); // �̺�Ʈ �����ʸ� ���δ�.
		panel.add(slider2);

		button = new JButton("");
		ImageIcon icon = new ImageIcon("./res/smile.png");
		button.setIcon(icon);
		button.setSize(INIT_VALUE * 10, INIT_VALUE * 10);
		panel.add(button);

		// BoxLayout
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		slider1.setAlignmentX(Component.CENTER_ALIGNMENT);

		add(panel);

		setVisible(true);
	}

	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider) e.getSource();

		if (source == slider1) {
			if (!source.getValueIsAdjusting()) {
				int value = (int) source.getValue();
				button.setSize(value * 10, (int) button.getSize().getHeight());
			}
		}

		if (source == slider2) {
			if (!source.getValueIsAdjusting()) {
				int value = (int) source.getValue();
				button.setSize((int) button.getSize().getWidth(), value * 10);
			}
		}
	}

	public static void main(String[] args) {
		new SliderTest();
	}
}

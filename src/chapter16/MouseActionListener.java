package chapter16;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MouseActionListener {

	public static void main(String[] args) {
		// �̹����� �巡���Ͽ� �����̱�, ���� ������ �̹��� ���� ��ȯ
		JFrame f = new JFrame();
		f.add(new MyPanel3());
		f.setSize(1000, 1000);
		f.setVisible(true);

	}

}

class MyPanel3 extends JPanel {
	BufferedImage img = null;
	BufferedImage imgBuffer = null;
	int imgX = 0, imgY = 0;

	public MyPanel3() {
		try {
			img = ImageIO.read(new File("./res/pixelcar2.png"));
		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				imgX = e.getX();
				imgY = e.getY();
			}
		});
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				if (keycode == KeyEvent.VK_ENTER) {
					if (img != null) {
						imgBuffer = img;
						img = null;
					} else {
						img = imgBuffer;
					}
				}
				repaint();
			}
		});

		this.requestFocus();
		setFocusable(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, imgX, imgY, null);
	}

}

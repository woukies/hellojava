package doing;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class CarImagePanel extends JPanel {
	BufferedImage img = null;
	int img_x = 0, img_y = 0;

	public CarImagePanel() {
	try {
		img = ImageIO.read(new File("./res/pixelcar2.png"));
		//img =  ImageIO.read(CarGame3.class.getResource("../res/pixelcar2.png")); 
	} catch (IOException e) {

		System.out.println("no image");
		System.exit(1);
	}
	addMouseListener(new MouseAdapter() {
		public void mousePressed(MouseEvent e) {
			img_x = e.getX();
			img_y = e.getY();
			repaint();
		}
	});
}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

public class CarGame3 extends JFrame {
	public CarGame3() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new CarImagePanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		new CarGame3();
	}
}
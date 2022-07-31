package gui;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

/**
 * Frames UI stuff.
 */
public class MyFrame extends JFrame {
	/**
	 * Constructor.
	 */
	public MyFrame() {
		this.setTitle("Test");
		this.setSize(1000, 1000);
		this.setIconImage(new ImageIcon("icon.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
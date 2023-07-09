package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.*;

/**
 * Frames UI stuff.
 */
public class MyFrame extends JFrame {
	JButton button = new JButton();

	/**
	 * Constructor.
	 */
	public MyFrame() {
//		button.setBounds(200, 100, 100, 50);
//		button.setText("Button");
//		button.setFocusable(false);
//		button.addActionListener(e -> System.out.println("Test"));

//		this.setTitle("Rhythm Game Tracker");
//		this.setSize(1000, 750);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
//		this.setIconImage(new ImageIcon("icon.png").getImage());

		JTextField text_field = new JTextField();
		text_field.setPreferredSize(new Dimension(250, 40));
		for (int i = 0; i > 2; i ++) {

		}
//		this.add(button);
		this.add(text_field);
		this.pack();
		this.setVisible(true);
	}
}
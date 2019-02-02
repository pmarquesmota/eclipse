package pt.marquesmota.Paul;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Panneau extends JPanel {
	public void paintComponent(Graphics g) {
	    g.drawString("Hello, world !", 10, 20);
	}
}

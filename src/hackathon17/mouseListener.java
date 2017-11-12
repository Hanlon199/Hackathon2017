package hackathon17;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;


public class mouseListener extends MouseAdapter {

	private MainPanel home;
	//private Handler handler;
	private String upgradeText;
	private double width;
	private double height;

	//this constructor not really necessary but I am leaving it just in case
	public mouseListener(MainPanel game) {
		this.home = home;
		//this.handler 		= handler;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width = (double) screenSize.getWidth();
		height = (double) screenSize.getHeight();
	}

	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if (mouseOver(mx, my, 250, 460, 350, 350)) {
			System.exit(1);
		}

		
	}

	public void mouseReleased(MouseEvent e) {

	}

	/**
	 * Helper method to detect is the mouse is over a "button" drawn via Graphics
	 * 
	 * @param mx
	 *            mouse x position
	 * @param my
	 *            mouse y position
	 * @param x
	 *            button x position
	 * @param y
	 *            button y position
	 * @param width
	 *            button width
	 * @param height
	 *            button height
	 * @return boolean, true if the mouse is contained within the button
	 */
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if (mx > x && mx < x + width) {
			if (my > y && my < y + height) {
				return true;
			} else
				return false;
		} else
			return false;
	}
}

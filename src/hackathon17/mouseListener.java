package hackathon17;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class mouseListener extends MouseAdapter {

	private MainPanel game;
	private double width;
	private double height;
	private ImportantNumbers numbers;

	
	public mouseListener(MainPanel game, ImportantNumbers numbers) {
		this.game = game;
		this.numbers = numbers;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width = (double) screenSize.getWidth();
		height = (double) screenSize.getHeight();
	}

	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();

		
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

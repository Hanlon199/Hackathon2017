package hackathon17;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

import hackathon17.app.STATE;


/**
 * Handles mouse input
 */

public class mouseListener extends MouseAdapter {

	private app game;
	private String upgradeText;
	private int width, height;

	public mouseListener(app app) {
		this.game = game;
		width = 350;
		height = 350;
	}

	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		if(game.gameState == STATE.MENU) {
			if(mouseOver(mx, my, 250, 60, width, height)) {
				game.gameState = STATE.REPORT;
			} else if(mouseOver(mx, my, 650, 60, width, height)) {
				game.gameState = STATE.NUMBERS;
			} else if(mouseOver(mx, my, 650, 460, width, height)) {
				game.gameState = STATE.LOCATION;
			} else if(mouseOver(mx, my, 340, 650, width, height)) {
				System.exit(1);
			} 
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

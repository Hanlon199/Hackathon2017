package hackathon17;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.net.URL;


public class MainPanel {
	private Image img;
	public MainPanel(){
		img = null;
		try {
			URL imageURL = app.class.getResource("images/background.jpg");
			img = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void render(Graphics g) {
			g.drawImage(img, 0, 0, app.WIDTH, app.HEIGHT, null);
			Font font = new Font("Amoebic", 1, 80);
			Font font1 = new Font("Amoebic", 1, 70);

			g.setColor(Color.orange);
			g.drawRect(250, 60, 350, 350);
			g.setFont(font);
			g.setColor(Color.orange);
			g.drawString("Report", 300, 250);

			g.setColor(Color.orange);
			g.drawRect(650, 60, 350, 350);
			g.setFont(font1);
			g.setColor(Color.orange);
			g.drawString("Important", 670, 200);
			g.drawString("Numbers", 680, 275);

			g.setColor(Color.orange);
			g.drawRect(250, 460, 350, 350);
			g.setFont(font);
			g.setColor(Color.orange);
			g.drawString("Quit", 340, 650);

			g.setColor(Color.orange);
			g.drawRect(650, 460, 350, 350);
			g.setFont(font);
			g.setColor(Color.orange);
			g.drawString("Location", 665, 650);

			
	}


}

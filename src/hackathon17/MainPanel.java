package hackathon17;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.net.URL;


public class MainPanel {
	
	public MainPanel(){
	}
	public void render(Graphics g) {

			Font font = new Font("Amoebic", 1, 100);
			Font font2 = new Font("Amoebic", 1, 60);
			Font font3 = new Font("Amoebic", 1, 50);
/**
			g.setFont(font);
			g.setColor(Color.orange);
			g.drawString("Game Modes", 792, 66);

			g.setFont(font);
			g.setColor(Color.orange);
			g.drawString("Player Known BattleLands", 20, 66);
**/
			g.setColor(Color.orange);
			g.drawRect(30, 60, 1220, 120);
			g.setFont(font);
			g.setColor(Color.orange);
			g.drawString("Report", 500, 155);

			g.setColor(Color.orange);
			g.drawRect(30, 240, 1220, 120);
			g.setFont(font);
			g.setColor(Color.orange);
			g.drawString("Important Numbers", 390, 330);

			g.setColor(Color.orange);
			g.drawRect(70, 420, 450, 110);
			g.setFont(font2);
			g.setColor(Color.orange);
			g.drawString("Quit", 200, 490);

			g.setColor(Color.orange);
			g.drawRect(760, 420, 450, 110);
			g.setFont(font2);
			g.setColor(Color.orange);
			g.drawString("Location", 880, 490);

			
	}

}

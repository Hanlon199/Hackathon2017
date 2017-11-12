package hackathon17;

import java.awt.Font;
import java.awt.*;
import hackathon17.app.STATE;
public class ImportantNumbers {
	private app app;

	public ImportantNumbers(app app) {
		this.app = app;
		
	}
	public void render(Graphics g) {
		if(app.gameState == STATE.NUMBERS) {
			
		
		
		Font font = new Font("impact", 1, 33);
		Font font1 = new Font("impact", 1, 50);
		
		g.setFont(font);
		g.setColor(Color.red);
		g.drawString("National Emergency Number: 911", 100, 160);
		g.drawString("Poison Control: (800) 222-1222", 100, 190);
		g.drawString("Suicide prevention: 1-800-273-8255", 100, 220);
		g.drawString("Local Police dept.", 100, 250);
		g.drawString("Local Fire dept.", 100, 280);
		g.drawString("Nearby Hospitals", 100, 310);
		g.drawString("Nearby Water Company", 100, 340);
		g.drawString("Nearby Power Company", 100, 370);
		
		g.drawRect(100, 500, 100, 150);
		g.setFont(font1);
		g.setColor(Color.red);
		g.drawString("Back", 100, 150);
	}
}
}


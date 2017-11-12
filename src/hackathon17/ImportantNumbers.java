package hackathon17;

import java.awt.Font;
import java.awt.*;

public class ImportantNumbers {

	public void render(Graphics g) {
		
		Font font = new Font("impact", 1, 33);
		
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
	}
}
package hackathon17;

import java.awt.*;
import javax.swing.*;
import java.applet.*;



public class app extends Canvas {
	private static MainPanel bet;
	private int windowHeight, windowWidth;
	JFrame mainScreen;
<<<<<<< HEAD
=======
	public STATE gameState = STATE.MENU;
>>>>>>> 3dc67bd3552657845348115e59542b4a6543afa6
	
	public app() {
		windowHeight = 1000;
    	windowWidth = 1280;		
        bet = new MainPanel();
        mainScreen = new JFrame();
        mainScreen.getContentPane().add(this, BorderLayout.CENTER);
        mainScreen.setSize(new Dimension(windowWidth,windowHeight));
        mainScreen.setVisible(true);
        
	}
	
	public enum STATE {
		MENU, NUMBERS, REPORT, LOCATION;
	};
	
    public static void main(String ad[])
    {
        app a=new app();  
    }
    
    public void paint (Graphics g)
    {
        bet.render(g);
    }


}

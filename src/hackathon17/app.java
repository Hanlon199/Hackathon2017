package hackathon17;

import java.awt.*;
import javax.swing.*;
import java.applet.*;



public class app extends Canvas {
	private static MainPanel bet;
	private int windowHeight, windowWidth;
	private mouseListener mouseListener;
	public STATE gameState = STATE.MENU;
	JFrame mainScreen;

	
	public app() {
		windowHeight = 1000;
    	windowWidth = 1280;		
        bet = new MainPanel(this);
        mainScreen = new JFrame();
        mainScreen.getContentPane().add(this, BorderLayout.CENTER);
        mainScreen.setSize(new Dimension(windowWidth,windowHeight));
        mainScreen.setVisible(true);
		mouseListener = new mouseListener(this);
		this.addMouseListener(mouseListener);
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

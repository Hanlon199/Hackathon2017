package hackathon17;

import java.awt.*;
import javax.swing.*;
import java.applet.*;



public class app extends Canvas {
	private static MainPanel bet;
	private int windowHeight, windowWidth;
	JFrame mainScreen;
	public app() {
		windowHeight = 720;
    	windowWidth = 1280;		
        bet = new MainPanel();
        mainScreen = new JFrame();
        mainScreen.getContentPane().add(this, BorderLayout.CENTER);
        mainScreen.setSize(new Dimension(windowWidth,windowHeight));
        mainScreen.setVisible(true);
	}
	
    public static void main(String ad[])
    {
 
        app a=new app();
       

    }
    
    public void paint (Graphics g)
    {
        bet.render(g);
    }


}

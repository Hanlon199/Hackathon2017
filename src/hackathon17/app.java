package hackathon17;

import java.awt.*;
import javax.swing.*;
import java.applet.*;



public class app extends Canvas {
<<<<<<< HEAD
	private MainPanel menu;
	public app(){
		menu = new MainPanel();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new app();
=======
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
>>>>>>> 734ec2d4ee547d07b6a818511267b4dd07f623a1
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

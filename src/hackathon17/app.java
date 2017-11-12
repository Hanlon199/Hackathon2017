package hackathon17;

import java.awt.*;
import javax.swing.*;
import java.applet.*;



public class app extends Canvas {
	private static MainPanel bet;
	
	public void paint (Graphics g)
    {
        bet.render(g);
    }

    public static void main(String ad[])
    {

        JFrame jp1 = new JFrame();
        bet = new MainPanel();
        app a=new app();
        jp1.getContentPane().add(a, BorderLayout.CENTER);
        jp1.setSize(new Dimension(500,500));
        jp1.setVisible(true);

    }

}

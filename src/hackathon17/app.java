package hackathon17;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;



public class app extends Canvas {
	private MainPanel menu;
	public app(){
		menu = new MainPanel();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new app();
	}

}

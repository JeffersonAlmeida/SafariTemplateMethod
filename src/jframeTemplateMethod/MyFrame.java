package jframeTemplateMethod;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame(String title){
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	// JFrame.paint é um gancho da clase javax.swing.JFrame
	// ou seja, o template method tb foi utilizado aqui
	public void paint(Graphics graphics){		 
		super.paint(graphics);
		String msn = "HELLO WORLD";
		graphics.drawString(msn,100,100);
	}
	
	public static void main(String [] args){
		MyFrame frame = new MyFrame("Head First Design Patterns");
	}
}	

package jframeTemplateMethod;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	private String msg;
	// gancho init permite fazer qq coisa ao iniciar o applet pela primeira vez
	public void init(){
		msg = "Hello world , I´m alive";
		repaint();
	}
	// O gancho Start permite que faça algo quando o applet esta prestes a ser iniciado
	public void start(){
		msg = "Hello world ,  start";
		repaint();
	}
	// quando o usuario segue para outra pagina, o gancho faz stop faz o que quiser
	// para finalizar suaas ações.
	public void stop(){
		msg = "Hello world , stop";
		repaint();
	}
	// gancho utilizado quando a janela do browser é fechada.
	public void destroy(){
		msg = "Hello world , destroy";
		repaint();
	}
	// gancho paint novamente, para redesenha a janela
	public void paint(Graphics g){		
		g.drawString(msg, 5, 15);
	}
}

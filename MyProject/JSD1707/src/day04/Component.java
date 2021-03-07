package day04;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Component extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int []px = new int[100];
	int []py = new int[100];
	public Component(){
		for(int i = 0;i<px.length;i++){
			px[i] = (int)(Math.random()*400+1);
		}
		for(int j = 0;j<py.length;j++){
			py[j] = (int)(Math.random()*600+1);
		}
	}
	public void paint(Graphics g){
		super.paint(g);
		setBackground(Color.BLACK);
		g.setColor(Color.ORANGE);
		for(int i = 0 ;i<px.length;i++){
			g.drawArc(px[i], py[i], 10, 10, 0, 360);
		}
	}
	public void move(){
		new Thread(){
			public void run(){
				while(true){
					for(int i = 0;i<py.length;i++){
						py[i] -= (int)(Math.random()*2+1);
						if(py[i]<0){
							py[i] = 600;
						}
					}

					repaint();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}

package day04;

import javax.swing.JFrame;

public class Demo1 {

	public static void main(String[] args) {
		JFrame js = new JFrame();
		js.setBounds(200, 50, 400, 600);
		js.setTitle("osk");
		Component c = new Component();
		js.add(c);
		c.move();
		js.setVisible(true);
	}	
}

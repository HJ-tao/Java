package edu.cj.javase.day0713;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class MyFrame2 extends Frame {
	private static final long serialVersionUID = 1L;

	public MyFrame2()  {
	}

	public MyFrame2(String title)  {
		setSize(300,200);
		setLocation(300, 240);
		addWindowListener(new MyListener1());
	}
	
	public static void main(String[] args) {
		MyFrame2 mf = new MyFrame2("我的第一个小窗体!");
		mf.setVisible(true);
	}
}
class MyListener1 extends WindowAdapter{
	
   @Override
public void windowClosing(WindowEvent e) {
	System.exit(0);
}
}

package edu.cj.javase.day0713;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class MyFrame1 extends Frame {
	private static final long serialVersionUID = 1L;

	public MyFrame1()  {
	}

	public MyFrame1(String title)  {
		setSize(300,200);
		setLocation(300, 240);
		addWindowListener(new MyListener());
	}
	
	public static void main(String[] args) {
		MyFrame1 mf = new MyFrame1("我的第一个小窗体!");
		mf.setVisible(true);
	}
}
class MyListener implements WindowListener{
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
   
}

package edu.shoot;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Airplane extends FlyingObject implements Enemy{
	private int ySpeed = 2;
	private int xSpeed = 2;
	private int index;
	private BufferedImage[] images;
	
	public Airplane(){
		Random rd = new Random();
		images = new BufferedImage[]{ShootGame.airplane1,ShootGame.airplane2,ShootGame.airplane3,ShootGame.airplane4,ShootGame.airplane5};
		int index = rd.nextInt(5);
		image = images[index];
		width = image.getWidth();
		height = image.getHeight();
		x = rd.nextInt(ShootGame.WIDTH-width);
		y = -height;
	}
	
	public int getScore(){
		return 5;
	}
	
	public void step(){
		x+=xSpeed;
		y+=ySpeed;
		if(x<=0){
			xSpeed = 1;
		}
		if(x>=ShootGame.WIDTH-width){
			xSpeed = -1;
		}
	}
	
	public boolean outOfBounds(){
		return y>=ShootGame.HEIGHT;
	}
	
	public Power[] shoot(){
		int xStep = width/4;
		Power[] bs = new Power[1];
		bs[0] = new Power(x+2*xStep-ShootGame.power.getWidth()/2,y+height);
		return bs;
	}
	
}

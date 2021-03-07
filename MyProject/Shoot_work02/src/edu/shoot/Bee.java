package edu.shoot;

import java.util.Random;

public class Bee extends FlyingObject implements Award{
	private int xSpeed;
	private int ySpeed = 2;
	private int awardType;
	
	public Bee(){
		image = ShootGame.bee;
		width = image.getWidth();
		height = image.getHeight();
		Random rd = new Random();
		xSpeed = rd.nextInt(10)%2==0?1:-1;
		x = rd.nextInt(ShootGame.WIDTH-width);
		y = -height;
		awardType = rd.nextInt(2);
	}
	
	public int getType(){
		return awardType;
	}
	
	public void step(){
		y+=ySpeed;
		x+=xSpeed;
		if(x<=0 || x>=ShootGame.WIDTH-width){
			xSpeed = -xSpeed;
		}
	}
	
	public boolean outOfBounds(){
		return y>=ShootGame.HEIGHT;
	}
	
}

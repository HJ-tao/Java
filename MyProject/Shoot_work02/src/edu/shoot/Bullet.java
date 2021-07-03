package edu.shoot;

import java.awt.image.BufferedImage;

public class Bullet extends FlyingObject {
	private int ySpeed = 6;
	private BufferedImage[] images;
	private int index;
	
	public Bullet(int x,int y){
		index = ((int)Math.random()*4);
		images = new BufferedImage[]{ShootGame.bullet1,ShootGame.bullet2,ShootGame.bullet3,ShootGame.bullet4};
		image = images[0];
		width = image.getWidth();
		height = image.getHeight();
		this.x = x;
		this.y = y;
	}
	
	public void step(){
		y-=ySpeed; 
		
	}
	
	public boolean outOfBounds(){
		return y<=-height;
	}
	
	
}

package day0912;

import java.awt.image.BufferedImage;

public class Power extends FlyingObject {
	private int ySpeed = 5;
	private BufferedImage[] images;
	
	public Power(int x,int y,int type){
		images = new BufferedImage[]{ShootGame.power0,ShootGame.power1};
		image = images[type];
		width = image.getWidth();
		height = image.getHeight();
		
		this.x = x;
		this.y = y;
	}
	
	public void step() {
		y+=ySpeed;
	}

	public boolean outOfBounds() {
		return y>=ShootGame.HEIGHT;
	}
	
	public boolean hit(Hero hero){
		int lx = hero.x-width;
		int rx = hero.x+hero.width;
		int ty = hero.y-height;
		int by = hero.y+hero.height;
		return x>=lx && x<=rx && y<=by && y>=ty;
	}

}

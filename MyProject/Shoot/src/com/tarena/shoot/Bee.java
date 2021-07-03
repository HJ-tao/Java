package com.tarena.shoot;

public class Bee extends FlyingObject implements Award {
	private int xSpeed = 1;
	private int ySpeed = 2;
	private int awardType;
	@Override
	public int getType() {
		return awardType;
	}
	public Bee(){
		this.image = ShootGame.bee;
		width = image.getWidth();
		height = image.getHeight();
		y = -height;
		x = (int)(Math.random()*(ShootGame.WIDTH-width));
//		x = 100;
//		y = 200;
		awardType = (int)(Math.random()*2);
	}
	
	public void step(){
		x += xSpeed;
		y += ySpeed;
		if(x > ShootGame.WIDTH-width){
			xSpeed = -1;
		}
		if(x < 0){
			xSpeed = 1;
		}
	}
	
	public boolean outOfBounds(){
		return y>ShootGame.HEIGHT;
	}

}

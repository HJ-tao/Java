package com.tarena.shoot;
//敌人飞机
public class Airplane extends FlyingObject implements Enermy {
	private int speed = 2;
	@Override
	public int getScore() {
		return 5;
	}
	public Airplane(){
		this.image = ShootGame.airplane;
		width = image.getWidth();
		height = image.getHeight();
//		x = 100;
//		y = 100;
		y = -height;
		x = (int)(Math.random()*(ShootGame.WIDTH-width));
	}
	
	public void step(){
		y += speed;
	}
	
	public boolean outOfBounds(){
		return y>ShootGame.HEIGHT;
	}
}

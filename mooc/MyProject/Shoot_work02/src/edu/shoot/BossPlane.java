package edu.shoot;

public class BossPlane extends FlyingObject implements Enemy {
	private int xSpeed = 1;
	
	public BossPlane(){
		image = ShootGame.bossplane;
		width = image.getWidth();
		height = image.getHeight();
		
		x = 0;
		y = 0;
	}

	public int getScore() {
		return 100;
	}

	public Power[] shoot() {
		int xStep = width/5;
		Power[] bs = new Power[5];
		bs[0] = new Power(0,0);
		int w = bs[0].width;
		int h = bs[0].height;
		bs[0].x = x+xStep-w/2;
		bs[0].y = y+9*h/10;
		return bs;
	}

	public void step() {
		x+=xSpeed;
		if(x<=0 || x>=ShootGame.WIDTH-width){
			xSpeed = -xSpeed;
		}
	}

	public boolean outOfBounds() {
		return false;
	}

}

package edu.shoot;

public class Power extends FlyingObject {
	private int speed = 4;
	public Power(int x,int y){
		image = ShootGame.power;
		width = image.getWidth();
		height = image.getHeight();
		this.x = x;
		this.y = y;
	}

	public void step() {
		y+=speed;
	}

	public boolean outOfBounds() {
		return y>=ShootGame.HEIGHT;
	}
	
	public boolean collision(Bullet b){
		int bx = b.x;
		int by = b.y;
		int x1 = this.x-b.width;
		int x2 = this.x+this.width;
		int y1 = this.y-b.height;
		int y2 = this.y+this.height;
		return bx>=x1 && bx<=x2 && by>=y1 && by<=y2;
	}

}

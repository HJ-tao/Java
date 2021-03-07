package edu.shoot;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected BufferedImage image;
	
	public abstract void step();
	
	public abstract boolean outOfBounds();
	
	public boolean shootBy(Bullet b){
		int bx = b.x;
		int by = b.y;
		int x1 = this.x-b.width;
		int x2 = this.x+this.width;
		int y1 = this.y-b.height;
		int y2 = this.y+this.height;
		return bx>=x1 && bx<=x2 && by>=y1 && by<=y2;
	}
 
}

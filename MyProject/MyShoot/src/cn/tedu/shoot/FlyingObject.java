package cn.tedu.shoot;
/** 飞行物  */

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
	protected BufferedImage image;
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	
	/** 飞行物走一步*/
	public abstract void step(); 
	/** 检测飞行物是否越界*/
	public abstract boolean outOfBounds();
    /** 敌人被子弹射击*/
	public boolean shootBy(Bullet b){
		int x1 = this.x;
		int x2 = this.x + width;
		int y1 = this.y;
		int y2 = this.y + height;
		int x = b.x;
		int y = b.y;
		return x>=x1 && x<=x2 && y>=y1 && y<=y2;
	}
	
}

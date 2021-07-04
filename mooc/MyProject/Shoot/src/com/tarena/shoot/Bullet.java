package com.tarena.shoot;

import java.awt.image.BufferedImage;

//子弹  是飞行物
public class Bullet extends FlyingObject {
	protected BufferedImage []images = {};//bullet的贴图，由两张图片组成
	protected int index = 0;//为两张图片交替显示计数
	
	private int speed = 3;
	private int type = 0;
	public Bullet(int x,int y){
		this.x = x;
		this.y = y;
		this.image = ShootGame.bullet;
	}
	
	public void step(){
		y -= speed;
	}
	
	public boolean outOfBounds(){
		return y<-height;
	}
	
	public int getType(){
		return type;
	}
	
	public void setType(int type){
		this.type = type;
	}
}

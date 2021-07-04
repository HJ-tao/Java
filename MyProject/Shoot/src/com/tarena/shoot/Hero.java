package com.tarena.shoot;

import java.awt.image.BufferedImage;

//英雄机  飞行物
public class Hero extends FlyingObject {
	protected BufferedImage []images = {};//hero的贴图，由两张图片组成
	protected int index = 0;//为两张图片交替显示计数
	
	private int doubleFire;
	private int life;
	
	public Hero(){
		life = 3;
		doubleFire = 0;
		this.image = ShootGame.hero0;
		images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1};
		width = image.getWidth();
		height = image.getHeight();
		x = 150;
		y = 400;
	}
	
	public void step(){
		if(images.length>0){
			image = images[index++/10%images.length];
		}
	}
	
	
	public Bullet []shoot(){
		int xStep = width/4;
		int yStep = 20;
		if(doubleFire>0){
			Bullet []bullets = new Bullet[2];
			bullets[0] = new Bullet(x+xStep,y-yStep);
			bullets[1] = new Bullet(x+3*xStep,y-yStep);
			doubleFire -= 2;
			return bullets;
		}else{//单发
			Bullet []bullets = new Bullet[1];
			bullets[0] = new Bullet(x+2*xStep,y-yStep);
			return bullets;
		}
	}
	
	public void moveTo(int x,int y){
		this.x = x - width/2;
		this.y = y - height/2;
	}
	
	
	//增加命
	public void addLife(){
		life ++;
	}
	
	//获取生命
	public int getLife(){
		return life;
	}
	
	//碰撞减命
	public void substractLife(){
		life --;
	}
	
	
	//增加双倍火力
	public void addDoubleFire(){
		doubleFire += 40;
	}
	
	//设置双倍火力
	public void setDoubleFire(int doubleFire){
		this.doubleFire = doubleFire;
	}
	
	public boolean outOfBounds(){
		return false;
	}
	
	//碰撞算法
	public boolean hit(FlyingObject other){
		int x1 = other.x - this.width/2;
		int x2 = other.x + other.width + this.width/2;
		int y1 = other.y - this.height/2;
		int y2 = other.y + other.height + this.height/2;
		return this.x+this.width/2>x1 && this.x+this.width/2<x2 && this.y+this.height/2>y1 && this.y+this.height/2<y2;
				
	}
	
}

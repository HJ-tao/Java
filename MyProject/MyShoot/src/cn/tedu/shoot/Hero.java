package cn.tedu.shoot;
/** 英雄机*/

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject{
	private int life;
	private int doubleFire;
	private BufferedImage[] images;  //图片数组
	private int index;  //协助图片切换
	
	/** 构造方法*/
	public Hero(){
		image = ShootGame.hero0;
		width = image.getWidth();
		height = image.getHeight();
		x = 150;
		y = 400;
		life = 3;
		doubleFire = 0;
		images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1};
		index = 0;
	}
	
	/** 重写step()*/
	public void step(){
		image = images[index++/10%images.length];
	}

	/** 英雄机发射子弹*/
	public Bullet[] shoot(){
		int xStep = this.width/4;//1/4英雄机的宽度
		int yStep = 20;
		if(doubleFire>0){
			Bullet[] bs = new Bullet[2];
			bs[0] = new Bullet(this.x+xStep,this.y-yStep);
			bs[1] = new Bullet(this.x+3*xStep,this.y-yStep);
			doubleFire-=2;
			return bs;
		}else{
			Bullet[] bs = new Bullet[1];
			bs[0] = new Bullet(this.x+2*xStep,this.y-yStep);
			return bs;
		}
	}
	
	/** 英雄机随着鼠标移动*/
	public void moveTo(int x,int y){
		this.x = x-this.width/2;
		this.y = y-this.height/2;
	}
	
	/** 重写outOfBounds()*/
	public boolean outOfBounds(){
		return false;
	}
	
	/** 加命*/
	public void addLife(){
		life++;
	}
	
	/** 减命*/
	public void substractLife(){
		life--;
	}
	
	/** 返回命*/
	public int getLife(){
		return life;
	}
	
	/** 清空火力值*/
	public void clearDoubleFire(){
		doubleFire = 0;
	}
	
	/** 加火力值*/
	public void addDoubleFire(){
		doubleFire+=40;
	}
	
	/** 检测英雄机与敌人相撞*/
	public boolean hit(FlyingObject other){
		int x1 = other.x-this.width;
		int x2 = other.x+other.width;
		int y1 = other.y-this.height;
		int y2 = other.y+other.height;
		int x = this.x;
		int y = this.y;
		return x>=x1 && x<=x2 && y>=y1 && y<=y2;
	}
	
}

package edu.shoot;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject {
	private int life;
	private int doubleFire;
	private BufferedImage[] images;
	private int index;
	
	public Hero(){
		image = ShootGame.hero0;
		width = image.getWidth();
		height = image.getHeight();
		life = 3;
		doubleFire = 0;
		images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1};
		index = 0;
		x = 150;
		y = 400;
	}
	
	public Bullet[] shoot(){
		int xStep = width/4;
		int yStep = height/10;
		if(doubleFire>0){
			Bullet[] bs = new Bullet[5];
			bs[0] = new Bullet(0,y-yStep);
			int w = bs[0].width;
			bs[0].x = x+xStep-w/2;
			bs[1] = new Bullet(x+2*xStep-w/2,y-yStep);
			bs[2] = new Bullet(x+3*xStep-w/2,y-yStep);
			bs[3] = new Bullet(x-w/2,y-yStep);
			bs[4] = new Bullet(x+4*xStep-w/2,y-yStep);
			doubleFire-=2;
			return bs;
		}else{
			Bullet[] bs = new Bullet[1];
			bs[0] = new Bullet(0,y-yStep);
			int w = bs[0].width;
			bs[0].x = x+2*xStep-w/2;
			return bs;
		}
	}
	
	public void step(){
		image = images[index++/10%2];
	}
	
	public boolean outOfBounds(){
		return false;
	}
	
	public void moveTo(int x,int y){
		this.x = x-width/2;
		this.y = y-height/2;
	}
	
	public void addDoubleFire(){
		doubleFire+=40;
	}
	
	public void clearDoubleFire(){
		doubleFire = 0;
	}
	
	public void addLife(){
		life++;
	}
	
	public void subtractLife(){
		life--;
	}
	
	public int getLife(){
		return life;
	}
	
	public boolean hit(FlyingObject other){
		int x = this.x;
		int y = this.y;
		int x1 = other.x-width;
		int x2 = other.x+other.width;
		int y1 = other.y-height;
		int y2 = other.y+other.height;
		return x>=x1 && x<=x2 && y>=y1 && y<=y2;
	}
	
	public boolean shootBy(Power p){
		int cx = p.x+p.width;
		int cy = p.y+p.height;
		int x1 = this.x;
		int x2 = this.x+this.width;
		int y1 = this.y;
		int y2 = this.y+this.height;
		return cx>=x1 && cx<=x2 && cy>=y1 && cy<=y2;
	}
	
}

package day0912;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject {
	private int index = 0;
	private BufferedImage[] images;
	private int doubleFire;
	private int life;
	private int bulletType;//子弹类型
	private int times;//改变子弹类型的时间长度
	private BufferedImage[] bulletImage;//不同子弹的数组
	
	public Hero(){
		image = ShootGame.hero0;
		width = image.getWidth();
		height = image.getHeight();
		life = 3;
		doubleFire = 40;
		bulletType = 0;
		times = 0;
		bulletImage = new BufferedImage[]{ShootGame.bullet0,ShootGame.bullet1};

		images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1};
		
		x = 200;
		y = 400;
	}
	
	public void step(){
		image = images[index++/10%2];
	}
	
	public int getLife(){
		return life;
	}
	
	public void addLife(){
		life++;
	}
	
	public void substractLife(){
		life--;
	}
	
	public int getDoubleFire(){
		return doubleFire;
	}
	
	public void addDoubleFire(int number){
		doubleFire+=number;
	}
	
	public void clearDoubleFire(){
		doubleFire = 0;
	}
	
	public void changeBulletType(){
		times+=100;
	}
	
	public int getBulletType(){
		return bulletType;
	}
	
	public int getTimes(){
		return times;
	}
	
	public void moveTo(int x,int y){
		this.x = x-width/2;
		this.y = y-height/2;
	}
	
	public boolean outOfBounds(){
		return false;
	}
	
	public boolean bang(FlyingObject f){
		int x = this.x;
		int y = this.y;
		int lx = f.x-width;
		int rx = f.x+f.width;
		int by = f.y+f.height;
		int ty = f.y-height;
		return x>=lx && x<=rx && y>=ty && y<=by;
	}
	
	public Bullet[] shoot(){
		int xStep = width/4;
		int yStep = height/10;
		BufferedImage image = null;
		if(times>0){
			bulletType = 1;
			times--;
		}else{
			bulletType = 0;
		}
		image = bulletImage[bulletType];
		if(doubleFire<=0){
			Bullet[] bullets = new Bullet[1];
			bullets[0] = new Bullet(0,y+yStep,0,image);
			int w = bullets[0].width;
			bullets[0].x = x+2*xStep-w/2;
			return bullets;
		}else{
			Bullet[] bullets = new Bullet[3];
			bullets[0] = new Bullet(0,y+yStep,-Math.PI/6,image);
			int w = bullets[0].width;
			bullets[0].x = x+xStep-w/2;
			bullets[1] = new Bullet(x+2*xStep-w/2,y+yStep,0,image);
			bullets[2] = new Bullet(x+3*xStep-w/2,y+yStep,Math.PI/6,image);
			doubleFire--;
			return bullets;
		}
	}
}

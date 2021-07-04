package day0912;

import java.awt.image.BufferedImage;

public class BossPlane extends FlyingObject implements Enemy {
	private int xSpeed;
	private int ySpeed = 4;
	private BufferedImage[] images;
	private int times = 0;
	public int TIME;
	
	public BossPlane(int number){
		images = new BufferedImage[]{ShootGame.bossplane0,ShootGame.bossplane1,ShootGame.bossplane2};
		image = images[number];
		width = image.getWidth();
		height = image.getHeight();
		xSpeed = (Math.random()*10)%2==0?1:-1;
		TIME = (number+1)*100;
		
		x = (ShootGame.WIDTH-width)/2;
		y = -height;
		
	}
	
	public int getScore() {
		return 10;
	}
	
	public int getYspeed(){
		return ySpeed;
	}
	
	public void addTimes(){
		times++;
	}
	
	public int getTimes(){
		return times;
	}
	
	public void step() {
		x+=xSpeed;
		if(x<=0 || x>=ShootGame.WIDTH-width){
			xSpeed = -xSpeed;
		}
	}
	
	private int t = 0;
	public void start(){
		y+=ySpeed;
		if(y>=ShootGame.HEIGHT){
			ySpeed=-ySpeed;
		}else if(y==0){
			t++;
		}
		if(t==2){
			ySpeed = 0;
		}
	}
	
	public boolean outOfBounds() {
		return true;
	}
	
	public Power shoot(){
		int xStep = width/4;
		int yStep = height/10;
		if(times<TIME/3){
			Power p = new Power(0,y+height-yStep,0);
			int w = p.width;
			p.x = x+2*xStep-w/2;
			return p;
		}else{
			Power p = new Power(0,y+height-yStep,1);
			int w = p.width;
			p.x = x+2*xStep-w/2;
			return p;
		}
		
	}

	public void changeImage() {
	}
	
}

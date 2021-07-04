package day0912;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Airplane extends FlyingObject implements Enemy{
	private int speed = 3;
	private int times = 0;//被击中次数
	private BufferedImage[] images;
	private int index;
	
	public Airplane(int level){
		Random rand = new Random();
		index = rand.nextInt(level+1);
		images = new BufferedImage[]{ShootGame.airplane0,ShootGame.airplane1,ShootGame.airplane2,ShootGame.airplane3};
		image = images[index];
		width = image.getWidth();
		height = image.getHeight();
		
		x = rand.nextInt(ShootGame.WIDTH-width);
		y = -height;
	}
	
	public int getImageIndex(){
		return index;
	}
	
	public void step(){
		y+=speed;
	}
	
	public boolean outOfBounds(){
		return y>=ShootGame.HEIGHT;
	}

	public void addTimes(){
		times++;
	}
	
	public int getTimes(){
		return times;
	}
	
	public int getScore() {
		return 5;
	}

	public void changeImage() {
		
	}
	
}

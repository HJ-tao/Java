package day0912;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Bee extends FlyingObject implements Award {
	private int xSpeed = 1;
	private int ySpeed = 2;
	private BufferedImage[] images;
	private int index;
	
	public Bee(){
		Rand rd = new Rand();
		index = rd.generateRandom(2,0.95,2);//产生概率数字
		images = new BufferedImage[]{ShootGame.bee0,ShootGame.bee1,ShootGame.bee2};
		image = images[index];
		
		width = image.getWidth();
		height = image.getHeight();
		
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH-width);
		y = -height;
	}
	
	public int getImageIndex(){
		return index;
	}
	
	public void step(){
		x += xSpeed;
		y += ySpeed;
		if(x<=0||x>=ShootGame.WIDTH-width){
			xSpeed = -xSpeed;
		}
	}
	
	public boolean outOfBounds(){
		return y>=ShootGame.HEIGHT;
	}

}

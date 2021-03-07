package cn.tedu.shoot;

import java.util.Random;

/** 小蜜蜂*/

public class Bee extends FlyingObject implements Award{
	private int xSpeed = -1;//x坐标速度
	private int ySpeed = 2;//y坐标速度
	private int awardType; //奖励类型
	
	/** 构造方法*/
	public Bee(){
		image = ShootGame.bee;
		width = image.getWidth();
		height = image.getHeight();
		Random rd = new Random();
		x = rd.nextInt(ShootGame.WIDTH-this.width); 
		y = -this.height;
		awardType = rd.nextInt(2);//0到1之间的随机数
	}
	
	/** 重写getType()*/
	public int getType(){
		return awardType;//直接返回奖励类型
	}
	
	/** 重写step()*/
	public void step(){
		x+=xSpeed;
		y+=ySpeed;
		if(x<=0){
			xSpeed = 1;
		}
		if(x>=ShootGame.WIDTH-this.width){
			xSpeed = -1;
		}
	}
	
	/** 重写outOfBounds()*/
	public boolean outOfBounds(){
		return y>=ShootGame.HEIGHT;
	}
	
}

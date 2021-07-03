package cn.tedu.shoot;
/** 小敌机*/

import java.util.Random;

public class Airplane extends FlyingObject implements Enemy{
	private int ySpeed = 2;  //控制移动速度
	/** 重写step()*/
	public void step(){
		y+=ySpeed;
	}
	
	/** 重写getScore()*/
	public int getScore(){
		return 30;
	}
	
	/** 重写outOfBounds()*/
	public boolean outOfBounds(){
		return y>=ShootGame.HEIGHT;
	}
	
}

class aircraft extends Airplane{
	/** 构造方法*/
	public aircraft(){
		Random rd = new Random();
		image = ShootGame.aircraft;
		width = image.getWidth();
		height = image.getHeight();
		x = rd.nextInt(ShootGame.WIDTH-this.width); 
		y = -this.height;
	}
	
	/** 重写getScore()*/
	public int getScore(){
		return 30;
	}
	
	
	
}

class littleplane extends Airplane implements Enemy{
	/** 构造方法*/
	public littleplane(){
		image = ShootGame.airplane;
		width = image.getWidth();
		height = image.getHeight();
		Random rd = new Random();
		x = rd.nextInt(ShootGame.WIDTH-this.width); 
		y = -this.height;
	}
	
	/** 重写getScore()*/
	public int getScore(){
		return 5;
	}
	
}

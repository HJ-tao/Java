package cn.tedu.shoot;


/** 子弹*/
public class Bullet extends FlyingObject{
	private int speed = 8;//移动速度
	
	/** 构造方法*/
	public Bullet(int x,int y){
		image = ShootGame.bullet;
		width = image.getWidth();
		height = image.getHeight();
		this.x = x;
		this.y = y;
	}
	
	/** 重写step()*/
	public void step(){
		y-=speed;
	}
	
	/** 重写outOfBounds()*/
	public boolean outOfBounds(){
		return y<=-height;
	}
	
	public void addSpeed(){
		speed+=10;
	}
	
}

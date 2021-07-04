package day0912;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Bullet extends FlyingObject {
	private int ySpeed = 5;
	private int xSpeed = 1;
	private double angle = 0;
	
	public Bullet(){
		this(0,0,0,null);
	}
	
	public Bullet(int x,int y,double angle,BufferedImage image){
		this.angle = angle;
		this.x = x;
		this.y = y;
		
		this.image = paintGra(image);
		width = image.getWidth();
		height = image.getHeight();
	}
	
	public BufferedImage paintGra(BufferedImage ps){
		int w = ps.getWidth();
        int h = ps.getHeight();
        int type = ps.getColorModel().getTransparency();//以获得原始图片透明度用于生成缓存图
        BufferedImage img;
        Graphics2D graphics2d;
        img = new BufferedImage(w, h, type);
        graphics2d = img.createGraphics();
        //graphics2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        //消除线段的锯齿状边缘
        graphics2d.rotate(angle, w/2, h/2);
        graphics2d.drawImage(ps, 0, 0, null);
        graphics2d.dispose();//销毁程序中指定的图形界面资源
        return img;
	}
	
	public double getAngle(){
		return angle;
	}
	
	public void step(){
		y -= ySpeed;
		if(angle<0){
			x-=xSpeed;
		}else if(angle>0){
			x+=xSpeed;
		}
	}
	
	public boolean hit(FlyingObject ap){
		int lx = ap.x-this.width;
		int rx = ap.x+ap.width;
		int ty = ap.y-this.height;
		int by = ap.y+ap.height;
		int x = this.x;
		int y = this.y;
		return x>=lx && x<= rx && y>=ty && y<=by;
	}
	
	public boolean outOfBounds(){
		int ry = this.y + this.height;
		return ry<=-ShootGame.HEIGHT;
	}
	
}

package com.tarena.shoot;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShootGame extends JPanel {
	public static final int WIDTH = 400;
	public static final int HEIGHT = 654;
	public static final int START = 0;
	public static final int RUNNING = 1;
	public static final int PAUSE = 2;
	public static final int GAME_OVER = 3;
	
	
	int flyEnteredIndex = 0;//飞行物入场计数
	private Timer timer;
	private int interval = 1000/100;
	private int score = 0;
	private int state;
	
	public static BufferedImage background;
	public static BufferedImage airplane;
	public static BufferedImage bee;
	public static BufferedImage bullet;
	public static BufferedImage start;
	public static BufferedImage hero0;
	public static BufferedImage hero1;
	public static BufferedImage pause;
	public static BufferedImage gameover;
	
	private FlyingObject []flyings = {};//敌机数组
	private Bullet[] bullets = {};//子弹数组
	private Hero hero = new Hero();
	
	public ShootGame(){
/*		flyings = new FlyingObject[2];
		flyings[0] = new Airplane();
		flyings[1] = new Bee();
		
		bullets = new Bullet[1];
		bullets[0] = new Bullet(200,350);*/
	}
	
	static{//静态代码块
		try {
			background = ImageIO.read(new File("image/background.png"));
			airplane = ImageIO.read(new File("image/plane2.png"));
			bee = ImageIO.read(new File("image/award_1.png"));
			bullet = ImageIO.read(new File("image/bullet_5.png"));
			hero0 = ImageIO.read(new File("image/1.png"));
			hero1 = ImageIO.read(new File("image/2.png"));
			start = ImageIO.read(new File("image/interface_1.png"));
			pause = ImageIO.read(new File("image/interface_2.png"));
			gameover = ImageIO.read(new File("image/interface_2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g){
		g.drawImage(background,0,0,null);
		paintHero(g);
		paintBullets(g);
		paintFlyingObjects(g);
		paintScore(g);
		paintState(g);
	}
	
	public void paintHero(Graphics g){
		g.drawImage(hero.getImage(),hero.getX(),hero.getY(),null);
	}
	
	public void paintBullets(Graphics g){
		for(int i = 0;i<bullets.length;i++){
			Bullet b = bullets[i];
			g.drawImage(b.getImage(),b.getX(),b.getY(),null);
		}
	}
	
	public void paintFlyingObjects(Graphics g){
		for(int i = 0;i<flyings.length;i++){
			FlyingObject f = flyings[i];
			g.drawImage(f.getImage(),f.getX(),f.getY(),null);
		}
	}
	
	public void paintScore(Graphics g){
		int x = 10;
		int y = 25;
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,14);
		g.setColor(new Color(0xBB3B3B));
		g.setFont(font);
		g.drawString("Score:"+score,x,y);
		y += 20;
		g.drawString("Life:"+hero.getLife(),x, y);
	}
	
	public void paintState(Graphics g){
		switch(state){
			case START:
				g.drawImage(start,0,0,null);
				break;
			case PAUSE:
				g.drawImage(pause,0,0,null);
				break;
			case GAME_OVER:
				g.drawImage(gameover,0,0,null);
				break;
		}
	}
	
	//随机生成飞行物
	public static FlyingObject nextOne(){
		int type = (int)(Math.random()*20);
		if(type == 0){
			return new Bee();
		}else{
			return new Airplane();
		}
	}
	
	
	//飞行物入场
	public void enterAction(){
		flyEnteredIndex ++;
		if(flyEnteredIndex%40==0){
			FlyingObject obj = nextOne();
			flyings = Arrays.copyOf(flyings, flyings.length+1);
			flyings[flyings.length-1] = obj;
		}
	}
	
	//飞行物走一步
	public void stepAction(){
		for(int i=0;i<flyings.length;i++){
			FlyingObject f = flyings[i];
			f.step();
		}
		for(int i=0;i<bullets.length;i++){
			Bullet b = bullets[i];
			b.step();
		}
		hero.step();
	}
	
	public void action(){
		MouseAdapter l = new MouseAdapter(){
			public void mouseMoved(MouseEvent e){//鼠标移动事件重写
				if(state == RUNNING){
					int x = e.getX();
					int y = e.getY();
					hero.moveTo(x, y);
				}
			}
			public void mouseEntered(MouseEvent e){//鼠标移入事件重写
				if(state == PAUSE){
					state = RUNNING;
				}
			}
			public void mouseExited(MouseEvent e){//鼠标移开事件重写
				if(state != GAME_OVER && state != START){
					state = PAUSE;
				}
			}
			public void mouseClicked(MouseEvent e){
				switch(state){
					case START:
						state = RUNNING;
						break;
					case GAME_OVER://游戏结束才清空
						flyings = new FlyingObject[0];
						bullets = new Bullet[0];
						hero = new Hero();
						score = 0;
						state = START;
						break;
				}
			}
		};
		this.addMouseListener(l);//处理鼠标点击操作
		this.addMouseMotionListener(l);//处理鼠标滑动操作
		
		timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run(){
				if(state == RUNNING){
					enterAction();//飞行物入场
					stepAction();//走一步
					shootAction();//射击
					
					bangAction();//碰撞检测
					outOfBoundsAction();//越界删除飞行物
					checkGameOverAction();//检查游戏是否结束
				}
				repaint();
			}
		}, interval,interval);
	}
	
	int shootIndex = 0;
	public void shootAction(){
		shootIndex ++;
		if(shootIndex % 30 == 0){
			Bullet []bs = hero.shoot();
			bullets = Arrays.copyOf(bullets, bullets.length+bs.length);
			System.arraycopy(bs, 0, bullets, bullets.length-bs.length, bs.length);//追加数组?????
		}
	}
	
	//碰撞检测
	public void bangAction(){
		for(int i = 0;i<bullets.length;i++){
			Bullet b = bullets[i];
			bang(b);
		}
	}
	
	public void bang(Bullet bullet){
		int index = -1;
		for(int i = 0;i<flyings.length;i++){
			FlyingObject obj = flyings[i];
			if(obj.shootBy(bullet)){
				index = i;
				break;
			}
		}
		if(index != -1){
			FlyingObject one = flyings[index];
			//将被击中的飞行物与最后一个飞行物交换
			FlyingObject temp = flyings[index];
			flyings[index] = flyings[flyings.length-1];
			flyings[flyings.length-1] = temp;
			//删除最后一个飞行物
			flyings = Arrays.copyOf(flyings, flyings.length-1);
			//判断飞行物进行相应的加分或奖励
			if(one instanceof Enermy){
				Enermy e = (Enermy) one;
				score += e.getScore();
			}else if(one instanceof Award){
				Award a = (Award) one;
				int awardType = a.getType();
				switch(awardType){
					case Award.DOUBLE_FIRE:
						hero.addDoubleFire();
						break;
					case Award.LIFE:
						hero.addLife();
						break;
				}
			}
		}
	}
	
	public void outOfBoundsAction(){
		//判断飞机是否越界
		FlyingObject[] flyingLives = new FlyingObject[flyings.length];
		int index = 0;
		for(int i = 0;i<flyings.length;i++){
			FlyingObject f = flyings[i];
			if(!f.outOfBounds()){
				flyingLives[index++] = f;
			}
		}
		flyings = Arrays.copyOf(flyingLives, index);
		//判断子弹是否越界
		index = 0;
		Bullet[] bulletsLives = new Bullet[bullets.length];
		for(int i = 0;i<bullets.length;i++){
			Bullet b = bullets[i];
			if(!b.outOfBounds()){
				bulletsLives[index++] = b;
			}
		}
		bullets = Arrays.copyOf(bulletsLives, index);
		
	}
	
	//判断游戏是否结束
	public boolean isGameOver(){
		for(int i=0;i<flyings.length;i++){
			int index = -1;
			FlyingObject obj = flyings[i];
			if(hero.hit(obj)){
				hero.substractLife();
				hero.setDoubleFire(0);
				index = i;//交换的是撞上的飞机
			}
			if(index!=-1){
				FlyingObject t = flyings[index];
				flyings[index] = flyings[flyings.length-1];
				flyings[flyings.length-1] = t;
				flyings = Arrays.copyOf(flyings, flyings.length-1);//交换之后立马缩容
			}
			
		}
		return hero.getLife()<=0;
	}
	
	public void checkGameOverAction(){
		if(isGameOver()){
			state = GAME_OVER;
		}
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("fly");
		ShootGame game = new ShootGame();
		frame.add(game);
		frame.setSize(WIDTH,HEIGHT);
		frame.setAlwaysOnTop(true);//总在最上
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//默认关闭操作
		frame.setLocationRelativeTo(null);//设置窗体初始位置
		frame.setVisible(true);

		game.action();
	}
}

package cn.tedu.shoot;
/** 主窗口类*/

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;   //画笔工具
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;    //定时处理
import java.util.TimerTask;   //定时任务
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShootGame extends JPanel {
	
	public static final int WIDTH = 400;  //窗口的宽
	public static final int HEIGHT = 654;  //窗口的高
	
	public static BufferedImage background;  //背景图片
	public static BufferedImage start;       //启动图
	public static BufferedImage pause;       //暂停图
 	public static BufferedImage gameover;    //结束图
	public static BufferedImage airplane;    //敌机图
	public static BufferedImage aircraft;
	public static BufferedImage bee;         //蜜蜂图
	public static BufferedImage bullet;      //子弹图
	public static BufferedImage hero0;       //英雄机1
	public static BufferedImage hero1;       //英雄机2
	
	 /* 文件处理:强制必须进行异常处理*/
	static{
		try{
			background = ImageIO.read(ShootGame.class.getResource("background.png"));
			start  = ImageIO.read(ShootGame.class.getResource("start.png"));
			pause = ImageIO.read(ShootGame.class.getResource("pause.png"));
			gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));
			airplane = ImageIO.read(ShootGame.class.getResource("airplane.png"));
			aircraft = ImageIO.read(ShootGame.class.getResource("aircraft.png"));
			bee = ImageIO.read(ShootGame.class.getResource("bee.png"));
			bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
			hero0 = ImageIO.read(ShootGame.class.getResource("hero0.png"));
			hero1 = ImageIO.read(ShootGame.class.getResource("hero1.png"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static final int START = 0;
	public static final int RUNNING = 1;
	public static final int PAUSE = 2;
	public static final int GAME_OVER = 3;
	private int state = START;
	
	private Hero hero = new Hero();
	private FlyingObject[] flyings = {};
	private Bullet[] bullets = {};
	
	/** 重写paint()*/
	public void paint(Graphics g){
		g.drawImage(background,0,0,null);
		paintHero(g);
		paintFlyingObjects(g);
		paintBullets(g);
		paintScoreAndLife(g);
		paintState(g);
	}
	/** 画英雄机对象*/
	public void paintHero(Graphics g){
		g.drawImage(hero.image,hero.x,hero.y,null);
	}
	/** 画小敌机+蜜蜂对象*/
	public void paintFlyingObjects(Graphics g){
		for(int i=0;i<flyings.length;i++){
			FlyingObject f = flyings[i];//获取每一个敌人
			g.drawImage(f.image,f.x,f.y,null);//画敌人
		}
	}
	/** 画子弹*/
	public void paintBullets(Graphics g){
		for(int i=0;i<bullets.length;i++){//遍历子弹数组
			Bullet b = bullets[i];//获取每一个子弹
			g.drawImage(b.image,b.x,b.y,null);//画子弹
		}
	}
	/** 画分数*/
    public void paintScoreAndLife(Graphics g){
		g.setColor(new Color(0xFF0000));
		g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,24));//字体 样式 字号
		g.drawString("SCORE:"+score,10,25);
		g.drawString("LIFE:"+hero.getLife(),10,45);
	}
	/** 画状态*/
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
    
	/** 生成敌人对象*/
	public FlyingObject nextOne(){
		Random rd = new Random();
		int type = rd.nextInt(20);
		if(type<4){
			return new Bee();
		}else if(type<16){
			return new littleplane();
		}else{
			return new aircraft();
		}
	}
	
	/** 敌人入场*/
	int flyIndex = 0;
	public void enterAction(){
		flyIndex++;
		if(flyIndex%40==0){//每400毫秒一次
			FlyingObject obj = nextOne();//获取敌人对象
			flyings = Arrays.copyOf(flyings, flyings.length+1);//扩容
			flyings[flyings.length-1] = obj;//将对象赋给最后一个元素
		}
	}
	
	/** 飞行物走一步*/
	public void stepAction(){
		hero.step();
		for(int i=0;i<flyings.length;i++){
			flyings[i].step();//敌人走一步
		}
		for(int i=0;i<bullets.length;i++){
			bullets[i].step();//子弹走一步
		}
	}
	
	/** 子弹入场*/
	int shootIndex = 0;
	public void shootAction(){
		shootIndex++;
		if(shootIndex%30==0){
			Bullet[] bs = hero.shoot();
			bullets = Arrays.copyOf(bullets,bullets.length+bs.length);
			System.arraycopy(bs,0,bullets,bullets.length-bs.length,bs.length);//数组追加
		}
	}
	
	/** 删除越界的飞行物*/
	public void outOfBoundsAction(){
		int index = 0;//下标 计数器
		FlyingObject[] flyingLives = new FlyingObject[flyings.length];//不越界的敌人数组
		for(int i=0;i<flyings.length;i++){
			FlyingObject f = flyings[i];
			if(!f.outOfBounds()){
				flyingLives[index] = f;
				index++;
			}
		}
		flyings = Arrays.copyOf(flyingLives, index);
		
		index = 0;
		Bullet[] bulletLives = new Bullet[bullets.length];
		for(int i=0;i<bullets.length;i++){
			Bullet b = bullets[i];
			if(!b.outOfBounds()){
				bulletLives[index] = b;
				index++;
			}
		}
		bullets = Arrays.copyOf(bulletLives, index);
		
	}
	
	/** 子弹与敌人的碰撞检测*/
	int score = 0;
	public void bangAction(){
		for(int i=0;i<bullets.length;i++){
			Bullet b = bullets[i];
			for(int j=0;j<flyings.length;j++){
				FlyingObject f = flyings[j];
				if(f.shootBy(b)){//已经撞上了
					FlyingObject t = flyings[j];
					flyings[j] = flyings[flyings.length-1];
					flyings[flyings.length-1] = t;
					flyings = Arrays.copyOf(flyings, flyings.length-1);
					/*Bullet temp = bullets[i];
					bullets[i] = bullets[bullets.length-1];
					bullets[bullets.length-1] = temp;
					bullets = Arrays.copyOf(bullets, bullets.length-1);*/
					if(f instanceof Enemy){
						Enemy e = (Enemy)f;
						score+=e.getScore();
					}
					if(f instanceof Award){
						Award a = (Award)f;
						int type = a.getType();
						switch(type){
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
		}
	}
	
	/**英雄机与敌人的碰撞检测*/
	public void hitAction(){
		for(int i=0;i<flyings.length;i++){
			FlyingObject f = flyings[i];
			if(hero.hit(f)){
				hero.substractLife();
				hero.clearDoubleFire();
				FlyingObject t = flyings[i];
				flyings[i] = flyings[flyings.length-1];
				flyings[flyings.length-1] = t;
				flyings = Arrays.copyOf(flyings, flyings.length-1);
			}
		}
	}
	
	/** 检测游戏结束*/
	public void checkGameOverAction(){
		if(hero.getLife()<=0){
			state = GAME_OVER;
		}
	}
	
	/** 启动程序*/
	public void action(){
		MouseAdapter l = new MouseAdapter(){//创建侦听器对象
			/** 重写鼠标移动事件*/
			public void mouseMoved(MouseEvent e){
				if(state==RUNNING){
					hero.moveTo(e.getX(), e.getY());//英雄机随着鼠标移动
				}
			}
			public void mouseClicked(MouseEvent e){
				switch(state){
					case START:
						state=RUNNING;
						break;
					case GAME_OVER:
						score = 0;
						hero = new Hero();
						flyings = new FlyingObject[0];
						bullets = new Bullet[0];
						state=START;
						break;
				}
			}
			public void mouseExited(MouseEvent e){
				if(state==RUNNING){
					state = PAUSE;
				}
			}
			public void mouseEntered(MouseEvent e){
				if(state==PAUSE){
					state = RUNNING;
				}
			}
		};
		this.addMouseListener(l);  //处理鼠标操作事件
		this.addMouseMotionListener(l);  //处理鼠标滑动事件
		
		
		Timer timer = new Timer();
		int intervel = 10;//以毫秒为单位
		timer.schedule(new TimerTask(){
			public void run(){//定时干的事
				if(state==RUNNING){
					enterAction();//实现敌人入场
					stepAction(); //飞行物走一步
					shootAction();//子弹入场
					outOfBoundsAction();//删除越界飞行物
					bangAction();//子弹与敌人的碰撞
					hitAction(); //英雄机与敌人的碰撞
					checkGameOverAction();//检测游戏结束
				}
				repaint();    //重画(调用paint)
			}
		},intervel,intervel);//public void schedule(TimerTask task,long delay,long period)
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("飞机大战");
		ShootGame game = new ShootGame();
		frame.add(game);
		frame.setSize(WIDTH,HEIGHT);
		frame.setAlwaysOnTop(true);     //窗口置顶
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //窗口结束的时候程序结束
		frame.setLocationRelativeTo(null);   //窗口居中
		frame.setVisible(true); 
		game.action();   //启动程序的执行
	}

}

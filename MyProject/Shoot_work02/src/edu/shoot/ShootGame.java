package edu.shoot;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShootGame extends JPanel {
	public static final int WIDTH = 400;
	public static final int HEIGHT = 600;
	
	public static BufferedImage background;
	public static BufferedImage start;
	public static BufferedImage pause;
	public static BufferedImage gameover;
	public static BufferedImage bee;
	public static BufferedImage bullet1;
	public static BufferedImage bullet2;
	public static BufferedImage bullet3;
	public static BufferedImage bullet4;
	public static BufferedImage power;
	public static BufferedImage airplane1;
	public static BufferedImage airplane2;
	public static BufferedImage airplane3;
	public static BufferedImage airplane4;
	public static BufferedImage airplane5;
	public static BufferedImage bossplane;
	public static BufferedImage hero0;
	public static BufferedImage hero1;
	
	static{
		try{
			background = ImageIO.read(ShootGame.class.getResource("image/background/background_1.png"));
			start = ImageIO.read(ShootGame.class.getResource("image/GameInterface/interface_1.png"));
			pause = ImageIO.read(ShootGame.class.getResource("image/GameInterface/interface_2.png"));
			gameover = ImageIO.read(ShootGame.class.getResource("image/GameInterface/interface_2.png"));
			bee = ImageIO.read(ShootGame.class.getResource("image/award/award_1.png"));
			bullet1 = ImageIO.read(ShootGame.class.getResource("image/bullet/bullet_1.png"));
			bullet2 = ImageIO.read(ShootGame.class.getResource("image/bullet/bullet_2.png"));
			bullet3 = ImageIO.read(ShootGame.class.getResource("image/bullet/bullet_3.png"));
			bullet4 = ImageIO.read(ShootGame.class.getResource("image/bullet/bullet_4.png"));
			power = ImageIO.read(ShootGame.class.getResource("image/bullet/bullet_7.png"));
			airplane1 = ImageIO.read(ShootGame.class.getResource("image/LittlePlane/plane2.png"));
			airplane2 = ImageIO.read(ShootGame.class.getResource("image/LittlePlane/plane3.png"));
			airplane3 = ImageIO.read(ShootGame.class.getResource("image/LittlePlane/plane4.png"));
			airplane4 = ImageIO.read(ShootGame.class.getResource("image/LittlePlane/plane5.png"));
			airplane5 = ImageIO.read(ShootGame.class.getResource("image/LittlePlane/plane6.png"));
			bossplane = ImageIO.read(ShootGame.class.getResource("image/plane_6.gif"));
			hero0 = ImageIO.read(ShootGame.class.getResource("image/1.png"));
			hero1 = ImageIO.read(ShootGame.class.getResource("image/2.png"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static final int START = 0;
	public static final int RUNNING = 1;
	public static final int PAUSE = 2;
	public static final int GAME_OVER = 3;
	private int state = START;
	
	Hero hero = new Hero();
	BossPlane boss = new BossPlane();
	FlyingObject[] flyings = {};
	Bullet[] bullets = {};
	Power[] powers = {};
	
	private int back = -background.getHeight()+HEIGHT;
	
	public void paint(Graphics g){
		g.drawImage(background,0,back,null);
		drawHero(g);
		drawFlyings(g);
		drawBoss(g);
		drawBullets(g);
		drawPowers(g);
		drawState(g);
		drawScoreAndLife(g);
	}
	
	public void drawHero(Graphics g){
		g.drawImage(hero.image,hero.x,hero.y,null);
	}
	
	public void drawFlyings(Graphics g){
		for(int i=0;i<flyings.length;i++){
			FlyingObject f = flyings[i];
			g.drawImage(f.image,f.x,f.y,null);
		}
	}
	
	public void drawBoss(Graphics g){
		g.drawImage(boss.image,boss.x,boss.y,null);
	}
	
	public void drawBullets(Graphics g){
		for(int i=0;i<bullets.length;i++){
			Bullet b = bullets[i];
			g.drawImage(b.image,b.x,b.y,null);
		}
	}
	
	public void drawPowers(Graphics g){
		for(int i=0;i<powers.length;i++){
			Power p = powers[i];
			g.drawImage(p.image,p.x,p.y,null);
		}
	}
	
	public void drawScoreAndLife(Graphics g){
		g.setColor(new Color(0xFF0000));
		g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
		g.drawString("SCORE："+score,10,25);
		g.drawString("LIFE: "+hero.getLife(), 10, 45);
	}
	
	public void drawState(Graphics g){
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
	
	public FlyingObject nextOne(){
		Random rd = new Random();
		int type = rd.nextInt(20);
		if(type<3){
			return new Bee();
		}else{
			return new Airplane();
		}
	}
	
	int flyIndex = 0;
	public void enterAction(){
		flyIndex++;
		if(flyIndex%40==0){
			FlyingObject f = nextOne();
			flyings = Arrays.copyOf(flyings, flyings.length+1);
			flyings[flyings.length-1] = f;
		}
	}
	
	int shootIndex=0;
	public void shootAction(){
		shootIndex++;
		if(shootIndex%50==0){
			Bullet[] bs = hero.shoot();
			bullets = Arrays.copyOf(bullets,bullets.length+bs.length);
			System.arraycopy(bs,0,bullets,bullets.length-bs.length,bs.length);
			
			Random rd = new Random();
			int index = 0;
			if(shootIndex%120==0){
				for(int i=0;i<flyings.length;i++){
					index = rd.nextInt(100);
					FlyingObject f = flyings[i];
					if(f instanceof Enemy){
						if(index%3==0){
							Enemy e = (Enemy)f;
							Power[] ps = e.shoot();
							powers = Arrays.copyOf(powers, powers.length+ps.length);
							System.arraycopy(ps,0,powers,powers.length-ps.length,ps.length);
						}
					}
				}
			}
		}
	}
	
	public void stepAction(){
		hero.step();
		boss.step();
		for(int i=0;i<flyings.length;i++){
			flyings[i].step();
		}
		for(int i=0;i<bullets.length;i++){
			bullets[i].step();
		}
		for(int i=0;i<powers.length;i++){
			powers[i].step();
		}
	}
	
	public void outOfBoundsAction(){
		int index = 0;
		FlyingObject[] flyingLives = new FlyingObject[flyings.length];
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
		
		index=0;
		Power[] powerLives = new Power[powers.length];
		for(int i=0;i<powers.length;i++){
			Power p = powers[i];
			if(!p.outOfBounds()){
				powerLives[index] = p;
				index++;
			}
		}
		powers = Arrays.copyOf(powerLives, index);
	}
	
	//子弹和飞机的撞击
	private int score = 0;
	public void bangAction(){
		for(int i=0;i<powers.length;i++){
			Power p = powers[i];
			if(hero.shootBy(p)){
				hero.subtractLife();
				hero.clearDoubleFire();
				
				Power t = powers[i];
				powers[i] = powers[powers.length-1];
				powers[powers.length-1] = t;
				powers = Arrays.copyOf(powers, powers.length-1);
			}
		}
		boolean flag = false;
		for(int i=0;i<bullets.length;i++){
			Bullet b = bullets[i];
			for(int j=0;j<flyings.length;j++){
				FlyingObject f = flyings[j];
				if(f.shootBy(b)){
					FlyingObject t = flyings[j];
					flyings[j] = flyings[flyings.length-1];
					flyings[flyings.length-1] = t;
					flyings = Arrays.copyOf(flyings, flyings.length-1);
					
					if(f instanceof Enemy){
						Enemy e = (Enemy)f;
						score += e.getScore();
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
	
	public void hitAction(){
		for(int i=0;i<flyings.length;i++){
			FlyingObject f = flyings[i];
			if(hero.hit(f)){
				hero.subtractLife();
				hero.clearDoubleFire();
				
				FlyingObject t = flyings[i];
				flyings[i] = flyings[flyings.length-1];
				flyings[flyings.length-1] = t;
				flyings = Arrays.copyOf(flyings, flyings.length-1);
			}
		}
	}
	
	public void collAction(){
		for(int i=0;i<bullets.length;i++){
			Bullet b = bullets[i];
			for(int j=0;j<powers.length;j++){
				Power p = powers[j];
				if(p.shootBy(b)){
					Bullet tm = bullets[i];
					bullets[i] = bullets[bullets.length-1];
					bullets[bullets.length-1] = tm;
					bullets = Arrays.copyOf(bullets,bullets.length-1);
					
					Power temp = powers[j];
					powers[j] = powers[powers.length-1];
					powers[powers.length-1] = temp;
					powers = Arrays.copyOf(powers, powers.length-1);
				}
			}
		}
	}
	
	public void isGameOver(){
		if(hero.getLife()<=0){
			state = GAME_OVER;
		}
	}
	
	public void action(){
		MouseAdapter l = new MouseAdapter(){
			public void mouseMoved(MouseEvent e){
				if(state==RUNNING){
					hero.moveTo(e.getX(), e.getY());
				}	
			}
			public void mouseClicked(MouseEvent e){
				switch(state){
					case START:
						state=RUNNING;
						break;
					case GAME_OVER:
						score=0;
						hero = new Hero();
						flyings = new FlyingObject[0];
						bullets = new Bullet[0];
						state=START;
						break;
				}
			}
			public void mouseExited(MouseEvent e){
				if(state==RUNNING){
					state=PAUSE;
				}
			}
			public void mouseEntered(MouseEvent e){
				if(state==PAUSE){
					state=RUNNING;
				}
			}
		};
		this.addMouseListener(l);
		this.addMouseMotionListener(l);
		
		Timer timer = new Timer();
		int intervel = 10;
		timer.schedule(new TimerTask(){
			public void run(){
				if(state==RUNNING){
					enterAction();
					shootAction();
					stepAction();
					outOfBoundsAction();
					bangAction();
					hitAction();
					collAction();
					isGameOver();
					if(back<=0){
						back++;
					}else{
						back=-background.getHeight()+HEIGHT;
					}
				}
				repaint();
			}
		},intervel,intervel);
	}
	
	
	/*ShootGame(){
		flyings = new FlyingObject[2];
		flyings[0] = new Bee();
		flyings[1] = new Airplane();
		bullets = new Bullet[1];
		bullets[0] = new Bullet(100,200);
	}*/
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("fly");
		ShootGame game = new ShootGame();
		frame.add(game);
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		game.action();
	}
}

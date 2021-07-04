package day0912;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShootGame extends JPanel{
	/**
	 * �����Ϸ������
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 600;
	public static final int HEIGHT = 840;
	public int level = 0;
	
	public static BufferedImage background0;
	public static BufferedImage background1;
	public static BufferedImage background2;
	public static BufferedImage start;
	public static BufferedImage pause;
	public static BufferedImage over;
	public static BufferedImage pass;
	public static BufferedImage airplane0;
	public static BufferedImage airplane1;
	public static BufferedImage airplane2;
	public static BufferedImage airplane3;
	public static BufferedImage airplane4;
	public static BufferedImage bee0;
	public static BufferedImage bee1;
	public static BufferedImage bee2;
	public static BufferedImage hero0;
	public static BufferedImage hero1;
	public static BufferedImage bullet0;
	public static BufferedImage bullet1;
	public static BufferedImage bossplane0;
	public static BufferedImage bossplane1;
	public static BufferedImage bossplane2;
	public static BufferedImage power0;
	public static BufferedImage power1;
	
	static{
		try {
			background0 = ImageIO.read(ShootGame.class.getResource("image/background/background1.png"));
			background1 = ImageIO.read(ShootGame.class.getResource("image/background/background2.png"));
			background2 = ImageIO.read(ShootGame.class.getResource("image/background/background3.png"));
			airplane0 = ImageIO.read(ShootGame.class.getResource("image/LittlePlane/plane2.png"));
			airplane1 = ImageIO.read(ShootGame.class.getResource("image/LittlePlane/plane3.png"));
			airplane2 = ImageIO.read(ShootGame.class.getResource("image/LittlePlane/plane4.png"));
			airplane3 = ImageIO.read(ShootGame.class.getResource("image/LittlePlane/plane5.png"));
			bee0 = ImageIO.read(ShootGame.class.getResource("image/award/award_1.png"));
			bee1 = ImageIO.read(ShootGame.class.getResource("image/award/award_2.png"));
			bee2 = ImageIO.read(ShootGame.class.getResource("image/award/award_3.png"));
			hero0 = ImageIO.read(ShootGame.class.getResource("image/1.png"));
			hero1 = ImageIO.read(ShootGame.class.getResource("image/2.png"));
			bullet0 = ImageIO.read(ShootGame.class.getResource("image/bullet/bullet_1.png"));
			bullet1 = ImageIO.read(ShootGame.class.getResource("image/bullet/bullet_2.png"));
			bossplane0 = ImageIO.read(ShootGame.class.getResource("image/BossPlane/plane_4.png"));
			bossplane1 = ImageIO.read(ShootGame.class.getResource("image/BossPlane/plane_5.png"));
			bossplane2 = ImageIO.read(ShootGame.class.getResource("image/BossPlane/plane_6.png"));
			power0 = ImageIO.read(ShootGame.class.getResource("image/bullet/bullet.png"));
			power1 = ImageIO.read(ShootGame.class.getResource("image/bullet/bullet_7.png"));
			start = ImageIO.read(ShootGame.class.getResource("image/GameInterface/start.png"));
			pause = ImageIO.read(ShootGame.class.getResource("image/GameInterface/pause.png"));
			over = ImageIO.read(ShootGame.class.getResource("image/GameInterface/gameover.png"));
			pass = ImageIO.read(ShootGame.class.getResource("image/GameInterface/pass.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	Collection<FlyingObject> flyings = new ArrayList<FlyingObject>();
	Collection<Bullet> bullets = new ArrayList<Bullet>();
	Collection<Power> powers = new ArrayList<Power>();
	BossPlane boss = new BossPlane(level);
	Hero hero = new Hero();

	public static final int START = 0;
	public static final int PAUSE = 1;
	public static final int GAMEOVER = 2;
	public static final int RUNNING = 3;
	public static final int PASS = 4;
	public BufferedImage[] backgrounds = {background0,background1,background2};
	private int state = START;
	private int score = 0;
	
	private int back = -backgrounds[level].getHeight()+ShootGame.HEIGHT;
	public void paint(Graphics g){
		g.drawImage(backgrounds[level], 0, back, null);
		paintBullets(g);
		paintFlyings(g);
		paintBossPlane(g);
		paintHero(g);
		paintState(g);
		paintString(g);
	}
	
	public void paintBullets(Graphics g){
		for(Bullet b:bullets){
			g.drawImage(b.image, b.x, b.y, null);
		}
		
		for(Power p:powers){
			g.drawImage(p.image, p.x, p.y, null);
		}
	}
	
	public void paintFlyings(Graphics g){
		for(FlyingObject f:flyings){
			g.drawImage(f.image, f.x, f.y, null);
		}
	}
	
	public void paintBossPlane(Graphics g){
		if(back==0){
			g.drawImage(boss.image, boss.x, boss.y, null);
		}
	}
	
	public void paintHero(Graphics g){
		g.drawImage(hero.image, hero.x, hero.y, null);
	}
	
	public void paintState(Graphics g){
		switch(state){
			case START:
				g.drawImage(start, 0, 0, null);
				break;
			case PAUSE:
				g.drawImage(pause, 0, 0, null);
				break;
			case GAMEOVER:
				g.drawImage(over, 0, 0, null);
				break;
			case PASS:
				g.drawImage(pass, 0, 0, null);
				break;
		}
	}
	
	public void paintString(Graphics g){
		if(state == RUNNING){
			g.setColor(new Color(255,0,0));
			g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
			g.drawString("����:"+score, 20, 30);
			g.drawString("����ֵ:"+hero.getLife(), 20, 50);
			g.drawString("˫������:"+hero.getDoubleFire(), 20, 70);
			g.drawString("�ӵ�����:"+hero.getBulletType(), 480, 30);
			g.drawString("ʱ��:"+hero.getTimes(), 480, 50);
		}
	}
	
	//�����ɻ�
	public FlyingObject nextOne(){
		Random rd = new Random();
		int type = rd.nextInt(15);
		if(type%15!=0){
			return new Airplane(level+1);
		}else{
			return new Bee();
		}
	}
	
	//�зɻ��ͽ����볡
	int flyIndex = 0;
	public void enterAction(){
		flyIndex++;
		if(flyIndex%30==0){    //0.4s����һ��������
			FlyingObject f = nextOne();
			flyings.add(f);
		}
	}

	//����boss�볡
	public void bossEnter(){
		boss.start();
		if(boss.getYspeed()<=0){
			boss.step();
		}
		for(Power p:powers){
			p.step();
		}
	}
	
	//�����ӵ��볡
	int shootIndex = 0;
	public void shootAction(){
		shootIndex++;
		if(shootIndex%10==0){
			Bullet[] bs = hero.shoot();
			Collection<Bullet> t = Arrays.asList(bs);
			bullets.addAll(t);
		}
	}
	
	//boss���ӵ��볡
	int shootNumber = 0;
	public void stabAction(){
		shootNumber++;
		if(shootNumber%35==0){
			boolean flag = (Math.random()*100)>40?true:false;
			if(flag){
				Power p = boss.shoot();
				powers.add(p);
			}
		}
	}
	
	//���˷ɻ�,����,�ӵ��Լ��������ƶ�
	public void stepAction(){
		hero.step();
		for(FlyingObject f:flyings){
			f.step();
		}
		
		for(Bullet b:bullets){
			b.step();
		}
	}
	
	//�����ӵ�����˷ɻ�����ײ���
	public void hitAction(){
		Iterator<Bullet> bs = bullets.iterator();//�����ӵ��ĵ�����
		while(bs.hasNext()){   
			Bullet b = bs.next();//ȡ�ӵ������ÿ��Ԫ��
			Iterator<FlyingObject> fs = flyings.iterator();//����������ĵ�����
			while(fs.hasNext()){ 
				FlyingObject f = fs.next();//ȡ�����������ÿ��Ԫ��
				if(f instanceof Airplane){
					Airplane a = (Airplane)f;
					if(b.hit(a)){
						score += a.getScore();
						a.addTimes();
						bs.remove();
						int diff = a.getImageIndex()+1;
						if(diff<=a.getTimes()){
							fs.remove();
						}
					}
				}
			}
		}
	}

	//�л��ӵ��뱾������ײ���
	public void catchAction(){
		Iterator<Power> ps = powers.iterator();
		while(ps.hasNext()){
			Power p = ps.next();
			if(p.hit(hero)){
				ps.remove();
				hero.substractLife();
			}
		}
	}
	
	//�ӵ������boss����ײ���
	public void hitBoss(){
		Iterator<Bullet> bs = bullets.iterator();
		while(bs.hasNext()){
			Bullet b = bs.next();
			if(b.hit(boss)){
				bs.remove();
				boss.addTimes();
			}
		}
	}
	
	//�ж��Ƿ�Խ��
	public void outOfBounds(){
		Iterator<FlyingObject> fs = flyings.iterator();
		while(fs.hasNext()){
			FlyingObject f = fs.next();
			if(f.outOfBounds()){
				fs.remove();
			}
		}
		Iterator<Bullet> bs = bullets.iterator();
		while(bs.hasNext()){
			Bullet b = bs.next();
			if(b.outOfBounds()){
				bs.remove();
			}
		}
		
		Iterator<Power> ps = powers.iterator();
		while(ps.hasNext()){
			Power p = ps.next();
			if(p.outOfBounds()){
				ps.remove();
			}
		}
	}
	
	//�����������������ײ��
	public void bangAction(){
		if(hero.bang(boss)){
			hero.substractLife();
			hero.clearDoubleFire();
			boss.addTimes();
		}
		Iterator<FlyingObject> fs = flyings.iterator();
		while(fs.hasNext()){
			FlyingObject f = fs.next();
			if(hero.bang(f)){
				if(f instanceof Airplane){
					hero.substractLife();
					hero.clearDoubleFire();
				}else if(f instanceof Bee){
					Bee aw = (Bee)f;
					int type = aw.getImageIndex();
					switch(type){
						case Award.LIFE:
							hero.addLife();
							break;
						case Award.DOUBLE_FIRE:
							hero.addDoubleFire(40);
							break;
						case Award.BULLET_TYPE:
							hero.changeBulletType();
							break;
					}
				}
				fs.remove();
			}
		}
	}

	//�ж���Ϸ�Ƿ����
	public void isGameOver(){
		if(hero.getLife()<=0){
			state = GAMEOVER;
		}
	}
	
	//�ж��Ƿ����
	public void isPass(){
		if(boss.getTimes()>=boss.TIME){
			state = PASS;
		}
	}
	
	public void action(){
		MouseAdapter l = new MouseAdapter(){
			public void mouseMoved(MouseEvent e){
				if(state == RUNNING){
					hero.moveTo(e.getX(), e.getY());
				}
			}
			
			public void mouseClicked(MouseEvent e){
				switch(state){
					case START:
						state=RUNNING;
						level = 0;
						break;
					case GAMEOVER:
						state = GAMEOVER;
						score = 0;
						level = 0;
						flyings.clear();
						bullets.clear();
						hero = new Hero();
						boss = new BossPlane(level);
						state = START;
						break;
					case PASS:
						flyings.clear();
						bullets.clear();
						powers.clear();
						if(level<backgrounds.length-1){
							state = RUNNING;
							level++;
							boss = new BossPlane(level);
							hero.addDoubleFire(100);
						}else{
							state = START;
						}
						back = -backgrounds[level].getHeight()+ShootGame.HEIGHT;
						break;
				}
			}
			
			public void mouseExited(MouseEvent e){
				if(state == RUNNING){
					state = PAUSE;
				}
			}
			
			public void mouseEntered(MouseEvent e){
				if(state == PAUSE){
					state = RUNNING;
				}
			}
		};
		this.addMouseListener(l);
		this.addMouseMotionListener(l);
		
		Timer timer = new Timer();
		int intervel = 10;
		timer.schedule(new TimerTask(){
			public void run(){
				if(state == RUNNING){
					enterAction();
					shootAction();
					stepAction();
					hitAction();
					if(back==0){
						bossEnter();
						if(boss.getYspeed()==0){
							stabAction();
							catchAction();
						}
						hitBoss();
						isPass();
					}
					outOfBounds();
					bangAction();
					isGameOver();
					if(back<0){
						back++;
					}else{
						back = 0;
					}
				}
				repaint();
			}
		}, intervel,intervel);
	}
	
	public static void main(String[] args) {
		JFrame jf = new JFrame("ShootGame");
		ShootGame game = new ShootGame();
		jf.add(game);
		jf.setSize(WIDTH, HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setAlwaysOnTop(true);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		game.action();
	}

}

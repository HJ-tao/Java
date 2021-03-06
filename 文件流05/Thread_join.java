package day10;
/**
 * 线程执行代码是异步的
 * 异步:各执行各的,互相没有影响.
 * 同步:有先后顺序的执行代码.
 * 
 * 线程提供了一个join方法,可以让线程之间
 * 同步执行代码.
 * @author adminitartor
 *
 */
public class Thread_join {
	//标示图片是否下载完毕
	public static boolean isFinish = false;
	
	public static void main(String[] args) {
		final Thread download = new Thread(){
			public void run(){
				System.out.println("down:开始下载图片...");
				for(int i=1;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:图片下载完毕!");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:准备显示图片...");
				//应当等待下载线程将图片下载完
				/*
				 * show线程调用download.join后就
				 * 进入了阻塞状态,直到download线程
				 * 结束才会解除阻塞.
				 */
				try {
					/*
					 * java8以前的版本要求,在一个方法
					 * 的局部内部类中若想引用这个方法的
					 * 其他局部变量,那么这个变量必须是final
					 * 的
					 */
					download.join();
				} catch (InterruptedException e) {
				}
				
				
				if(!isFinish){
					throw new RuntimeException("图片没有下载完毕!");
				}
				System.out.println("show:显示图片完毕!");
			}
		};
		
		download.start();
		show.start();
	}
}









package day09;

import javax.management.RuntimeErrorException;

/**
 * 线程执行代码是异步的
 * 异步:各执行各的,互相没有影响.
 * 同步:有先后顺序的执行代码.
 * 
 * 线程提供了一个join方法,可以让线程之间同步执行代码.
 * @author soft01
 *
 */
public class Thread_join {
    //标识图片是否下载完毕
	public static boolean isFinish = false;

	public static void main(String[] args) {
		final Thread download = new Thread(){
			public void run(){
				System.out.println("down:开始下载图片");
				for(int i=0;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("down:图片下载完毕.");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:准备显示图片");
				//应当等待下载线程将图片下载完
				/*
				 * show线程调用download.join后就进入了阻塞状态,直到download
				 * 线程结束才会解除阻塞.
				 */
				try {
					/*
					 * java8以前的版本要求,在一个方法的局部内部类中若想引用这个
					 * 方法的其他局部变量,那么这个变量必须是final的
					 */
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("图片没有下载完毕.");
				}
				System.out.println("show:显示图片完毕.");
			}
		};
		download.start();
		show.start();
	}
}

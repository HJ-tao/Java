package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池是用来管理和调度线程的.
 * 主要有两个作用:
 * 1:控制线程数量
 * 2:重用线程
 * 
 * 当项目中需要创建大量线程,或者发现线程有
 * 频繁创建销毁等情况时,就应当考虑使用线程池
 * 来管理线程.
 * @author adminitartor
 *
 */
public class ExecutorService_execute {
	public static void main(String[] args) {
		ExecutorService threadPool
			= Executors.newFixedThreadPool(3);
		
		for(int i=0;i<5;i++){
			Runnable runn = new Runnable(){
				public void run(){
					Thread t = Thread.currentThread();
					System.out.println(
						t.getName()+":正在执行任务...");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						System.out.println(t.getName()+"被中断了!");
					}
					System.out.println(
						t.getName()+":运行任务完毕");
				}
			};
			threadPool.execute(runn);
			System.out.println("指派了一个任务给线程池");		
		}
		
		/*
		 * shutdown()
		 * 线程池不再接收新的任务,并且会将当前
		 * 线程池中所有任务都执行完毕后停止.
		 * 
		 * shutdownNow()
		 * 会强制将线程池中所有线程中断并立即
		 * 停止线程池
		 */
		threadPool.shutdownNow();
		System.out.println("线程池停止了!");
		
	}
}












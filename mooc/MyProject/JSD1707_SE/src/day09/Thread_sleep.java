package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 线程提供了一个静态方法:
 * static void sleep(long ms)
 * 该方法会将运行这个方法的线程阻塞指定毫秒当超时后该线程会重新回到RUNNABLE
 * 状态等待再次分配CPU时间并发运行.
 * @author Random
 *	
 */
public class Thread_sleep {

	public static void main(String[] args) {
		/*
		 * 实现电子表功能
		 * 每秒钟输出当前系统时间,格式:
		 * 16:57:25
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		while(true){
			Date date = new Date();
			System.out.println("Time:"+sdf.format(date));
			for(int i=0;i<5;i++){
				System.out.println();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		/*System.out.println("程序开始了");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("程序结束了");*/
	}

}

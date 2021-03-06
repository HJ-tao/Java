package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 线程提供了一个静态方法:
 * static void sleep(long ms)
 * 该方法会将运行这个方法的线程阻塞指定毫秒
 * 当超时后该线程会重新回到RUNNABLE状态等待
 * 再次分配CPU时间并发运行.
 * @author adminitartor
 *
 */
public class Thread_sleep {
	public static void main(String[] args) {
		/*
		 * 实现电子表功能
		 * 每秒钟输出当前系统时间,格式:
		 * 16:57:25
		 */
		SimpleDateFormat sdf
			= new SimpleDateFormat("HH:mm:ss");
		while(true){
			Date now = new Date();
			System.out.println(sdf.format(now));
			for(int i=0;i<5;i++){
				System.out.println();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}
}









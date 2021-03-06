package day09;
/**
 * 线程优先级
 * 线程的优先级有10个,分别用数字1-10表示
 * 其中1最低,10最高,5为默认优先级.
 * 
 * 理论上,优先级越高的线程获取CPU时间片的
 * 次数就越多.
 * 
 * @author adminitartor
 *
 */
public class Thread_setPriority {
	public static void main(String[] args) {
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("max");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("min");
				}
			}
		};
		Thread nor = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("nor");
				}
			}
		};	
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);		
		min.start();
		nor.start();
		max.start();
	}
	
}









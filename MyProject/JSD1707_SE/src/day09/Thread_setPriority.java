package day09;
/**
 * 线程优先级
 * 线程的优先级有10个,分别用数字1-10表示
 * 其中1最低,10最高,5为默认优先级.
 * 
 * 理论上,优先级越高的线程获取CPU时间片的次数就越多.
 * @author Random
 *	
 */
public class Thread_setPriority {

	public static void main(String[] args) {
		Thread nor = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("nor");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("min");
				}
			}
		};
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("max");
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

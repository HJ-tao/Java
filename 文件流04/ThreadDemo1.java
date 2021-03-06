package day09;
/**
 * 线程有两种创建方式:
 * 方式一:继承Thread并重写run方法
 * 
 * @author adminitartor
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * 启动线程要注意,不要直接调用线程
		 * 的run方法,因为run方法是线程要执行
		 * 的任务.而启动线程是调用start方法.
		 * 当start方法执行完毕后,线程会纳入到
		 * 线程调度中.一旦线程调度分配cpu时间
		 * 片后,该线程会自动执行它的run方法.
		 * 
		 */
		t1.start();
		t2.start();
	}
}
/**
 * 第一种创建线程的方式有两个不足:
 * 1:由于java是单继承的,这就导致如果继承了
 *   Thread就不能继承其他类,在实际开发中经常
 *   会继承某各类来复用方法,这就导致若需要
 *   同时具备线程能力时出现继承冲突.
 * 2:由于继承Thread后需要重写run方法来定义
 *   线程要执行的任务,这就导致线程与任务有
 *   一个必然的耦合关系,会导致线程重用性差.  
 * @author adminitartor
 *
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊?");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是查水表的!");
		}
	}
}





package day10;
/**
 * 静态方法如果使用synchronized后,该方法
 * 一定具有同步效果.
 * @author adminitartor
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				Boo.dosome();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				Boo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}

class Boo{
	public static synchronized void dosome(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":正在执行dosome方法...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(t.getName()+":运行dosome方法完毕!");
	}
}







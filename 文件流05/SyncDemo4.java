package day10;
/**
 * ��̬�������ʹ��synchronized��,�÷���
 * һ������ͬ��Ч��.
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
		System.out.println(t.getName()+":����ִ��dosome����...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(t.getName()+":����dosome�������!");
	}
}







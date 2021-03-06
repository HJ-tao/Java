package day10;

public class SyncDemo5 {
	public static void main(String[] args) {
		final Coo coo = new Coo();
		Thread t1 = new Thread(){
			public void run(){
				coo.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				coo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}

class Coo{
	private Object o1 = new Object();
	private Object o2 = new Object();
	public void methodA(){
		try {
			Thread t = Thread.currentThread();
			synchronized (o1) {
				System.out.println(
					t.getName()+":正在运行A方法...");
				Thread.sleep(5000);
				methodB();
				System.out.println(
					t.getName()+":正在A方法完毕...");
			}
		} catch (Exception e) {
		}
	}
	public void methodB(){
		try {
			Thread t = Thread.currentThread();
			synchronized (o2) {	
				System.out.println(t.getName()+":正在运行B方法...");
				Thread.sleep(5000);
				methodA();
				System.out.println(t.getName()+":正在B方法完毕...");
			}
		} catch (Exception e) {
		}
	}
}






package day10;
/**
 * 有效缩小同步范围可以在保证并发安全的
 * 前提下尽可能的提高并发效率
 * @author adminitartor
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		final Shop shop = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}

class Shop{
	public void buy(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在挑选衣服...");
			Thread.sleep(5000);
			/*
			 * 同步块
			 * 同步块可以更精确的括上需要多个线程
			 * 同步执行的代码.有效的缩小同步范围
			 * 可以提高并发效率
			 * 需要注意的是,同步块需要指定"同步监视器"
			 * 即:上锁的对象.
			 * 若希望多个线程可以同步执行代码,那么
			 * 上锁的这个对象必须多个线程看到的是
			 * [同一个]才行
			 */
			synchronized (this) {
				System.out.println(t.getName()+":正在试衣服...");
				Thread.sleep(5000);
			}	
			
			System.out.println(t.getName()+":结账离开.");
			
		} catch (Exception e) {
			
		}
		
		
	}
}


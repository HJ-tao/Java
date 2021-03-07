package day09;
/**
 * 有效缩小同步范围可以在保证并发安全的前提下尽可能的提高并发效率
 * @author soft01
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
	public synchronized void buy(){
		Thread t= Thread.currentThread();
		try{
			System.out.println(t.getName()+"：正在挑选衣服...");
		    Thread.sleep(5000);
		    
		    synchronized(t){
			    System.out.println(t.getName()+":正在试衣服...");
			    Thread.sleep(5000);
		    }
		    
		    System.out.println(t.getName()+":买衣服了...");
		}catch(Exception e){
			
		}
	}
}
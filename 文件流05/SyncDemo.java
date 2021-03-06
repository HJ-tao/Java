package day10;
/**
 * 多线程并发安全问题
 * 当多个线程访问同一个资源时,由于线程切换
 * 时机不确定,导致代码执行顺序出现混乱,直接
 * 影响代码执行结果(未按照代码设计的执行顺序
 * 有序执行代码).严重时可能导致系统瘫痪.
 * @author adminitartor
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//模拟线程切换
					System.out.println(
							getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//模拟线程切换
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}

class Table{
	private int beans = 20;
	/**
	 * 当一个方法使用synchronized修饰后,那么
	 * 该方法称为"同步方法",即:多个线程不能
	 * 同时访问方法内部(只能排队,有先后顺序
	 * 的执行方法内部代码).
	 * 这样就不会因为多个线程同时在方法内部
	 * 执行由于出现线程切换导致代码执行顺序
	 * 出现混乱的情况.
	 * 
	 * 在方法上使用synchronized,那么同步
	 * 监视器对象为当前方法所属对象,即:
	 * 方法中看到的"this"
	 * 
	 * 
	 * @return
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("没有豆子了!");
		}
		Thread.yield();//模拟线程切换
		return beans--;
	}
}








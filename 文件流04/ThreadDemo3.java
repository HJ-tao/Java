package day09;
/**
 * 使用匿名内部类完成两种方式的线程创建
 * @author adminitartor
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你是谁啊?");
				}
			}
		};	
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("我是查水表的!");
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}








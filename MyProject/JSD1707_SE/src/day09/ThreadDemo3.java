package day09;

public class ThreadDemo3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("你是谁啊?");
				}
			}
		};
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("我是查水表的!");
				}
			}
		});
		t1.start();
		t2.start();
	}

}

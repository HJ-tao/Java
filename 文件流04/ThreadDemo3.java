package day09;
/**
 * ʹ�������ڲ���������ַ�ʽ���̴߳���
 * @author adminitartor
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭��?");
				}
			}
		};	
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("���ǲ�ˮ���!");
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}








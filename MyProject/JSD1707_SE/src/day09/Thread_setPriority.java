package day09;
/**
 * �߳����ȼ�
 * �̵߳����ȼ���10��,�ֱ�������1-10��ʾ
 * ����1���,10���,5ΪĬ�����ȼ�.
 * 
 * ������,���ȼ�Խ�ߵ��̻߳�ȡCPUʱ��Ƭ�Ĵ�����Խ��.
 * @author Random
 *	
 */
public class Thread_setPriority {

	public static void main(String[] args) {
		Thread nor = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("nor");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("min");
				}
			}
		};
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("max");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		
		min.start();
		nor.start();
		max.start();
		
	}

}

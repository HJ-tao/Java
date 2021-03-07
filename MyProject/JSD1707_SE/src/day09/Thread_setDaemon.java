package day09;
/**
 * �ػ��߳�,�ֳ�Ϊ��̨�߳�
 * �ػ��߳���ʹ�úʹ���ʱ����ǰ̨�߳�һ�£��߳�Ĭ�ϴ�������ʱ����ǰ̨�̣߳�
 * ���ǽ���ʱ����һ�㲻ͬ,��:���̽���ʱ,�����ػ��̶߳��ᱻǿ���ж�.
 * ��һ�������е�����ǰ̨�̶߳�����ʱ,���̾ͻ����.
 * @author soft01
 *
 */
public class Thread_setDaemon {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("rose:��������");
				System.out.println("��Ч:��ͨ");
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump I jump");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					};
				}
			}
		};
		rose.start();
		/*
		 * ����Ϊ��̨�߳�,��Ҫע��,�÷����������߳�����ǰ����.
		 * 
		 */
		jack.setDaemon(true);
		jack.start();
	}
}

package day10;
/**
 * ��Ч��Сͬ����Χ�����ڱ�֤������ȫ��
 * ǰ���¾����ܵ���߲���Ч��
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
			System.out.println(t.getName()+":������ѡ�·�...");
			Thread.sleep(5000);
			/*
			 * ͬ����
			 * ͬ������Ը���ȷ��������Ҫ����߳�
			 * ͬ��ִ�еĴ���.��Ч����Сͬ����Χ
			 * ������߲���Ч��
			 * ��Ҫע�����,ͬ������Ҫָ��"ͬ��������"
			 * ��:�����Ķ���.
			 * ��ϣ������߳̿���ͬ��ִ�д���,��ô
			 * �������������������߳̿�������
			 * [ͬһ��]����
			 */
			synchronized (this) {
				System.out.println(t.getName()+":�������·�...");
				Thread.sleep(5000);
			}	
			
			System.out.println(t.getName()+":�����뿪.");
			
		} catch (Exception e) {
			
		}
		
		
	}
}


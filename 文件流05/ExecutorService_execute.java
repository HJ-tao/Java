package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳�����������͵����̵߳�.
 * ��Ҫ����������:
 * 1:�����߳�����
 * 2:�����߳�
 * 
 * ����Ŀ����Ҫ���������߳�,���߷����߳���
 * Ƶ���������ٵ����ʱ,��Ӧ������ʹ���̳߳�
 * �������߳�.
 * @author adminitartor
 *
 */
public class ExecutorService_execute {
	public static void main(String[] args) {
		ExecutorService threadPool
			= Executors.newFixedThreadPool(3);
		
		for(int i=0;i<5;i++){
			Runnable runn = new Runnable(){
				public void run(){
					Thread t = Thread.currentThread();
					System.out.println(
						t.getName()+":����ִ������...");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						System.out.println(t.getName()+"���ж���!");
					}
					System.out.println(
						t.getName()+":�����������");
				}
			};
			threadPool.execute(runn);
			System.out.println("ָ����һ��������̳߳�");		
		}
		
		/*
		 * shutdown()
		 * �̳߳ز��ٽ����µ�����,���һὫ��ǰ
		 * �̳߳�����������ִ����Ϻ�ֹͣ.
		 * 
		 * shutdownNow()
		 * ��ǿ�ƽ��̳߳��������߳��жϲ�����
		 * ֹͣ�̳߳�
		 */
		threadPool.shutdownNow();
		System.out.println("�̳߳�ֹͣ��!");
		
	}
}












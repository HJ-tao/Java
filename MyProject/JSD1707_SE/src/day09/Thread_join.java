package day09;

import javax.management.RuntimeErrorException;

/**
 * �߳�ִ�д������첽��
 * �첽:��ִ�и���,����û��Ӱ��.
 * ͬ��:���Ⱥ�˳���ִ�д���.
 * 
 * �߳��ṩ��һ��join����,�������߳�֮��ͬ��ִ�д���.
 * @author soft01
 *
 */
public class Thread_join {
    //��ʶͼƬ�Ƿ��������
	public static boolean isFinish = false;

	public static void main(String[] args) {
		final Thread download = new Thread(){
			public void run(){
				System.out.println("down:��ʼ����ͼƬ");
				for(int i=0;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("down:ͼƬ�������.");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:׼����ʾͼƬ");
				//Ӧ���ȴ������߳̽�ͼƬ������
				/*
				 * show�̵߳���download.join��ͽ���������״̬,ֱ��download
				 * �߳̽����Ż�������.
				 */
				try {
					/*
					 * java8��ǰ�İ汾Ҫ��,��һ�������ľֲ��ڲ����������������
					 * �����������ֲ�����,��ô�������������final��
					 */
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("ͼƬû���������.");
				}
				System.out.println("show:��ʾͼƬ���.");
			}
		};
		download.start();
		show.start();
	}
}

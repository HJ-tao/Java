package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �߳��ṩ��һ����̬����:
 * static void sleep(long ms)
 * �÷����Ὣ��������������߳�����ָ�����뵱��ʱ����̻߳����»ص�RUNNABLE
 * ״̬�ȴ��ٴη���CPUʱ�䲢������.
 * @author Random
 *	
 */
public class Thread_sleep {

	public static void main(String[] args) {
		/*
		 * ʵ�ֵ��ӱ���
		 * ÿ���������ǰϵͳʱ��,��ʽ:
		 * 16:57:25
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		while(true){
			Date date = new Date();
			System.out.println("Time:"+sdf.format(date));
			for(int i=0;i<5;i++){
				System.out.println();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		/*System.out.println("����ʼ��");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("���������");*/
	}

}

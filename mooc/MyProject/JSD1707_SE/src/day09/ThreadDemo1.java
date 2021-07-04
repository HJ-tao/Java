package day09;

public class ThreadDemo1 {

	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * �����߳�Ҫע��,��Ҫֱ�ӵ����̵߳�run����,��Ϊrun�������߳�Ҫִ�е�
		 * ����.�������߳��ǵ���start����.��start����ִ����Ϻ�,�̻߳����뵽
		 * �̵߳�����.һ���̵߳��ȷ���cpuʱ��Ƭ��,���̻߳��Զ������Ǹ�����run
		 * ����.
		 */
		t1.start();
		t2.start();
	}

}
/**
 * ��һ�ִ����̵߳ķ�ʽ����������:
 * 1.����Java�ǵ��̳е�,��͵�������̳���Thread�Ͳ��ܼ̳�������,��ʵ�ʿ���
 * �о�����̳�ĳ���������÷���,��͵�������Ҫͬʱ�߱��߳�����ʱ���ּ̳г�ͻ.
 * 2.���ڼ̳�Thread����Ҫ��дrun�����������߳�Ҫִ�е�����,��͵����߳�������
 * ��һ����Ȼ����Ϲ�ϵ,�ᵼ���߳������Բ�.
 * @author Random
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭��?");
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("���ǲ�ˮ����!");
		}
	}
}
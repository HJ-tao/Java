package day09;
/**
 * ���̲߳�������
 * ������̷߳���ͬһ����Դʱ,�����߳��л�ʱ����ȷ��,���´���ִ��˳��
 * ���ֻ���,ֱ��Ӱ�����ִ�н��(δ���մ�����Ƶ�ִ��˳������ִ�д���).
 * ����ʱ���ܵ���ϵͳ̱��.
 * @author soft01
 *
 */
public class SyncDemo {

	public static void main(String[] args) {
		final Table table = new Table();
		
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}

}

class Table{
	private int beans = 20;
	/**
	 * ��һ������ʹ��synchronized���κ�,��ô�÷�����Ϊ"ͬ������",
	 * ��:����̲߳���ͬʱ���ʷ����ڲ�(ֻ���Ŷ�,���Ⱥ�˳���ִ�з���
	 * �ڲ�����).
	 * �����Ͳ�����Ϊ����߳�ͬʱ�ڷ����ڲ�ִ�����ڳ����߳��л����´�
	 * ��ִ��˳����ֻ��ҵ����.
	 * @return
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("û�ж�����.");
		}
		Thread.yield();//ģ���߳��л�
		return beans--;
	}
}

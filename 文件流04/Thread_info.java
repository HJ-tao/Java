package day09;
/**
 * ��ȡ�߳���Ϣ����ط���
 * @author adminitartor
 *
 */
public class Thread_info {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		String name = main.getName();
		System.out.println("name:"+name);
		
		long id = main.getId();
		System.out.println("id:"+id);
		
		int priority = main.getPriority();
		System.out.println("priority:"+priority);
		
		boolean isAlive = main.isAlive();
		System.out.println("isAlive:"+isAlive);
		//�Ƿ�Ϊ�ػ��߳�
		boolean isDaemon = main.isDaemon();
		System.out.println("isDaemon:"+isDaemon);
		//�Ƿ��Ǳ��жϵ�
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isInterrupted:"+isInterrupted);
	}
}







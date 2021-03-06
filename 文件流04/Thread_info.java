package day09;
/**
 * 获取线程信息的相关方法
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
		//是否为守护线程
		boolean isDaemon = main.isDaemon();
		System.out.println("isDaemon:"+isDaemon);
		//是否是被中断的
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isInterrupted:"+isInterrupted);
	}
}







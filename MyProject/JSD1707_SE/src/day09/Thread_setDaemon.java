package day09;
/**
 * 守护线程,又称为后台线程
 * 守护线程是使用和创建时都与前台线程一致（线程默认创建出来时都是前台线程）
 * 但是结束时机有一点不同,即:进程结束时,所有守护线程都会被强制中断.
 * 当一个进程中的所有前台线程都结束时,进程就会结束.
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
				System.out.println("rose:啊啊啊啊");
				System.out.println("音效:扑通");
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
		 * 设置为后台线程,需要注意,该方法必须在线程启动前调用.
		 * 
		 */
		jack.setDaemon(true);
		jack.start();
	}
}

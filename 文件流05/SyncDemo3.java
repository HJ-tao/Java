package day10;
/**
 * 互斥锁
 * 
 * 互斥锁可以让多段代码间执行是互斥的,即
 * 当其中一段代码被一个线程执行时,其他线程
 * 除了这段代码不能执行外,其他代码也不可以
 * 执行.
 * 只要使用同步块将需要互斥的代码括起来,然后
 * 保证这些同步块指定的同步监视器对象是同一个
 * 即可.
 * @author adminitartor
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		final Foo foo  = new Foo();
		Thread t1 = new Thread(){
			public void run(){
				foo.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				foo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}

class Foo{
	public synchronized void methodA(){
		Thread t = Thread.currentThread();
		System.out.println(
				t.getName()+":正在执行A方法");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(
				t.getName()+":执行A方法完毕");
	}
	public synchronized void methodB(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":正在执行B方法");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(t.getName()+":执行B方法完毕");
	}
}








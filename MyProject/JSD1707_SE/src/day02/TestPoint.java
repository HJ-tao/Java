package day02;
/**
 * 用来测试Point重写Object的相关方法
 * @author soft01
 *
 */
public class TestPoint {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		/*
		 * Object定义了方法:
		 * String toString()
		 * 通常,当我们需要使用一个对象的toString方法,就应当重写该方法.因为
		 * Object提供的该方法返回的是该对象的句柄:
		 * 类名@地址
		 * 这样得不到关于该对象内容的实际相关信息.
		 */
		String str = p.toString();
		
		System.out.println(str);
		System.out.println(p);
		
		Point p2 = new Point(1,2);
		System.out.println("p2:"+p2);
		
		System.out.println(p==p2);
		System.out.println(p.equals(p2));
	}

}

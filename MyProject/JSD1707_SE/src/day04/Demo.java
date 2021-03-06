package day04;

import day02.Point;

public class Demo {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		System.out.println("p:"+p);
		/*
		 * java传递方式只有一种:值传递
		 * 这里只是将p保存的值(地址)传给了方法中的参数p1
		 */
		test(p);
		System.out.println("p:"+p);
		
	}
	
	public static void test(Point p1){
		/*
		 * p1由于与p指向同一个对象,所以将其x值可以改变为2,main方法中的p看到的也是改后的效果.
		 */
		p1.setX(2);
		/*
		 * p1重新指向一个新创建的对象,但是并不影响main方法中的p对原来对象的引用.
		 */
		p1 = new Point(3,4);
	}
}

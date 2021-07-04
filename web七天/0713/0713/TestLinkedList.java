package edu.cj.javase.day0713;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	/**
	 *  如果子类除了重写父类的某些方法外还有自定义的其他方法，那么这些自定义的方法只能通过子类本身
	 *       去实例化生成的对象方可以"." 的方式去掉用到,如果用向上转型的方式生成父类对象是不能引用到
	 *       子类中自定义的方法的
	 */
	public static void main(String[] args) {
		/*LinkedList list = new LinkedList();  //向上转型
		list.addFirst("hahah");*/

	}

}

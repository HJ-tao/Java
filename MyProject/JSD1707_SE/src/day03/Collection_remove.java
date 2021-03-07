package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean remove(E e)
 * 删除集合元素
 * @author soft01
 *
 */
public class Collection_remove {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(1,2));
		System.out.println(c);
		
		Point p = new Point(1,2);
		/*
		 * boolean remove(E e)
		 * 从当前集合中删除指定元素.成功删除则返回true
		 * 需要注意,该方法只会删除一个元素,并且删除的是集合中
		 * 与给定元素equals比较为true的.若有多个,则删除第一
		 * 个比较为true的.
		 */
		c.remove(p);
		System.out.println(c);
	}

}

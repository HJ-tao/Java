package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e)
 * 判断当前集合是否包含给定元素
 * @author soft01
 *
 */
public class Collection_contains {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,5));
		
		Point p = new Point(1,2);
		/*
		 * 集合在判断给定元素是否被集合包含时,是依靠集合元素equals比较的结果,即:只要给定
		 * 元素与集合现有元素有equals比较为true的时候,集合就认为包含该元素.
		 */
		
		boolean contains = c.contains(p);
		System.out.println("是否包含:"+contains);
	}

}

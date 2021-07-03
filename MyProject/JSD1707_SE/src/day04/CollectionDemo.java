package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * 集合只存放引用类型的元素
 * 并且集合存放的是元素的引用(地址)
 * @author soft01
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection<Point> c = new ArrayList<Point>();
		Point p = new Point(1,2);
		
		c.add(p);
		System.out.println("p:"+p);
		System.out.println("c:"+c);
		
		p.setX(2);
		System.out.println("p:"+p);
		System.out.println("c:"+c);
	}
}

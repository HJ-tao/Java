package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * ����ֻ����������͵�Ԫ��
 * ���Ҽ��ϴ�ŵ���Ԫ�ص�����(��ַ)
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

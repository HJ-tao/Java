package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean remove(E e)
 * ɾ������Ԫ��
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
		 * �ӵ�ǰ������ɾ��ָ��Ԫ��.�ɹ�ɾ���򷵻�true
		 * ��Ҫע��,�÷���ֻ��ɾ��һ��Ԫ��,����ɾ�����Ǽ�����
		 * �����Ԫ��equals�Ƚ�Ϊtrue��.���ж��,��ɾ����һ
		 * ���Ƚ�Ϊtrue��.
		 */
		c.remove(p);
		System.out.println(c);
	}

}

package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e)
 * �жϵ�ǰ�����Ƿ��������Ԫ��
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
		 * �������жϸ���Ԫ���Ƿ񱻼��ϰ���ʱ,����������Ԫ��equals�ȽϵĽ��,��:ֻҪ����
		 * Ԫ���뼯������Ԫ����equals�Ƚ�Ϊtrue��ʱ��,���Ͼ���Ϊ������Ԫ��.
		 */
		
		boolean contains = c.contains(p);
		System.out.println("�Ƿ����:"+contains);
	}

}

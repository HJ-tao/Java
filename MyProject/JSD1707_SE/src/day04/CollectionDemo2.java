package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ���ϵļ��ϲ���
 * @author soft01
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		c1.add("java");
		c1.add("c");
		c1.add(".net");
		System.out.println("c1:"+c1);
		
		Collection<String> c2 = new HashSet<String>();
		c2.add("android");
		c2.add("ios");
		c2.add("java");
		System.out.println("c2:"+c2);
		
		/*
		 * boolean addAll(Collection c)
		 * �������ļ����е�Ԫ�ش��뵽��ǰ������
		 * ��ǰ����Ԫ�ط����˱仯�򷵻�true
		 */
		c2.addAll(c1);
		System.out.println("c2:"+c2);
		
		Collection<String> c3 = new ArrayList<String>();
		c3.add("c");
		c3.add("ios");
		System.out.println("c3:"+c3);
		/*
		 * boolean containsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�����Ԫ��
		 */
		boolean containsAll = c2.containsAll(c3);
		System.out.println("c2����c3������Ԫ��:"+containsAll);
		/*
		 * removeAll(Collection c)
		 * ɾ����ǰ��������������ϵ���ͬԪ��
		 */
		c2.removeAll(c3);
		System.out.println("c2:"+c2);
	}

}

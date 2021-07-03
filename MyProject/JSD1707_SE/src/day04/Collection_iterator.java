package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ��������Ԫ��
 * 
 * �����ṩͳһ�ı���Ԫ�صķ�ʽ:������ģʽ
 * �����ṩ�����ڻ�ȡ������ǰ����Ԫ�صķ���:
 * Iterator iterator()
 * 
 * java.util.Iterator
 * �������Ľӿ�,�涨�˱������ϵķ���,��ѭ��ģʽΪ:��,ȡ,ɾ�Ĳ���
 * ����ɾ���������Ǳ������
 * 
 * ��ͬ�ļ���ʵ���඼�ṩ��һ�����Ա�������ĵ�����ʵ����.
 * ���������ס���ǵ�����,�����ǵ�Iterator��������.
 * @author soft01
 *
 */
public class Collection_iterator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println("c:"+c);
		
		//��ȡ���ڱ����ü��ϵĵ�����
		Iterator it = c.iterator();
		/*
		 * boolean hasNext()
		 * �жϼ����Ƿ���Ԫ�ؿ��Ա���
		 */
		while(it.hasNext()){
			/*
			 * E next()
			 * ȡ��������һ�����Ա�����Ԫ��
			 */
			String str = (String)it.next();
			System.out.println(str);
			if("#".equals(str)){
				/*
				 * ��ʹ�õ�������������Ԫ�صĹ�����,����ͨ�����ϵķ�����ɾԪ��
				 * ����������������������ϵ��쳣
				 */
				//c.remove(str);
				/*
				 * ��������remove��ɾ��ͨ��next����ȡ����Ԫ��
				 */
				it.remove();
			}
		}
		System.out.println("c:"+c);
	}
}

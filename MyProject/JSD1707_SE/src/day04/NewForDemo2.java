package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ʹ����ѭ������
 * @author soft01
 *
 */
public class NewForDemo2 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		/*
		 * ��ѭ�������µ��﷨,JVM�����Ͽ���ѭ��.��ѭ���Ǳ������Ͽɵ�,��������������ʹ����ѭ����������ʱ,�Ὣ����ı�Ϊʹ�õ���������.
		 * ����ʹ����ѭ���������ϵĹ������ǲ���ͨ�����ϵķ�����ɾԪ�ص�.
		 */
		for(Object o:c){
			String str = (String)o;
			System.out.println(str);
			if("#".equals(str)){
				c.remove(str);//ɾ����,�´α������׳��쳣
			}
		}
	}

}

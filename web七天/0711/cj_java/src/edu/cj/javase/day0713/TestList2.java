package edu.cj.javase.day0713;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestList2 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {		
		         
        /*
         * add()���ڽ���Ӧ�����ݷ��õ�������ȥ,
         * ��û�õ�����֮ǰ���뼯�ϵ����������Զ�����ΪObject
         * ȡ������ʱ��Ҳ��Object,�������Ҫ��ԭ��������Ҫǿ������ת��______�����Ҫת���ɻ�������
         * ��Ҫ�õ�java��8�ֻ����������Ͷ�Ӧ��8�ְ�װ�������ǿת,����ת��ʧ�ܣ�
         * ȡ������get(int index) index��0��ʼ
         * �������ϵĳ��ȿ���size()������ȡ��
         * 
         * ��JDK5.0���Ƴ���java�ķ��ͼ���,��Ա��浽�����е��������͵�һ��Լ��
         * ��ʹ�÷���ʱ������������ͱ����ָ������ƥ��
         * ȡ������ʱ����Ҫǿ��ת��
         * 
         */
		
		List list = new ArrayList() ;   
	    list.add(1);
        list.add(1L);
        list.add(1.0);
        list.add(1.0f);
        list.add('1');
        list.add("1");
        
        Object obj  = list.get(0);
        int i = (Integer)obj;
        System.out.println("i = "+i);
	}
      
}

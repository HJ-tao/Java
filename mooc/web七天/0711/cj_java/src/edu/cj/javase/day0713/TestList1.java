package edu.cj.javase.day0713;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestList1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		//ArrayList()Ĭ�ϵĳ���Ϊ10
		List list = new ArrayList();
        list.add(1);
        list.add(1L);
        list.add(1.0);
        list.add(1.0f);
        list.add('1');
        list.add("1");
        list.add(new Date());
        int []nums = {1,2,3,4,5,6};
        list.add(nums);
        //list.add(new int[]{1,2,3,4,5,6});
        List list1 = new ArrayList();
        list1.add("hello");
        list.add(list1);
        
        /*
         * add()���ڽ���Ӧ�����ݷ��õ�������ȥ,
         * ��û�õ�����֮ǰ���뼯�ϵ����������Զ�����ΪObject
         * ȡ������ʱ��Ҳ��Object,�������Ҫ��ԭ��������Ҫǿ������ת��
         * ȡ������get(int index) index��0��ʼ
         * �������ϵĳ��ȿ���size()������ȡ��
         * 
         * ��JDK5.0���Ƴ���java�ķ��ͼ���,��Ա��浽�����е��������͵�һ��Լ��
         * ��ʹ�÷���ʱ������������ͱ����ָ������ƥ��
         * ȡ������ʱ����Ҫǿ��ת��
         * 
         */
        //System.out.println(list.get(0));
        
        /*
         * ѭ����������Ԫ��
         * ���������ֲ�ͬ��ѭ��
         *   while do-while for
         *   
         *   ����������ǿ�͵�forѭ��
         *   
         *   ������ͨ�������еĵ�����ѭ�����
         */
        //��ͨѭ��
        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
        //System.out.println("*******************************************");
        //��ǿ��forѭ��
        /*for (Object object : list) {
			System.out.println(object);
		}
        System.out.println("*******************************************");
        //������ѭ��
        /*Iterator it = list.iterator();
        for (;it.hasNext();) 
        {
			System.out.println(it.next());
		}*/
	   }

}

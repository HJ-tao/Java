package edu.cj.javase.day0713;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestList3 {

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
         *   ���ͼ��ϵ��﷨����:
         *      ����<ָ���洢����������(ֻ���Ƕ�������)>  ���϶�����  = new �����нӿڵ�ĳ��ʵ����<ָ���洢����������(ֻ���Ƕ�������)>();
         *      List<Float> list = new ArrayList<Float>();
         *      ���ͼ��ϵļ��б���(�����ԵĿ���)
         *      1.List<Float> list = new ArrayList<Float>();
         *      2.List<Float> list = new ArrayList(); //����JDK5.0ǰ�ļ���
         *      3.List list = new ArrayList<Float>(); //�߰汾���ݵͰ汾
         *      �����д��:_____ԭ�������Ͳ�ƥ��
         *      List<Float> list = new ArrayList<Object>();  
         *      List<Object> list = new ArrayList<Float>();
         */
		
		List<Float> list = new ArrayList<Float>();
		   float f = 87.8f;
		   int num = 12;
	        list.add(1.0f);
	        list.add(f); 
	        list.add(new Float(num));
	        //list.add(0, 12.56f); //��ָ��������λ���ϲ����Ӧ��Ԫ�� add(Float f)�����ط���
	        //ȡ�����ͼ����е�����ʱ����Ҫ����ת��
	       float number =  list.get(0);
	       System.out.println(number);
	       
	        
	}
      
}

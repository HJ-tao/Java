package edu.cj.javase.day0713;

import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestList4 {

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
         *      
         *      
         *      
         *      һ������ collection��֧�������˲�����Ƴ�Ԫ�ء�
         *      ���� deque �ǡ�double ended queue��˫�˶��У�������д��
         *      ͨ����Ϊ��deck��������� Deque ʵ�ֶ��������ܹ�������Ԫ����û�й̶�����
         *      �����˽ӿڼ�֧�����������Ƶ�˫�˶��У�Ҳ֧��û�й̶���С���Ƶ�˫�˶��С� 

				�˽ӿڶ�����˫�˶������˷���Ԫ�صķ������ṩ���롢�Ƴ��ͼ��Ԫ�صķ�����
				ÿ�ַ���������������ʽ��һ����ʽ�ڲ���ʧ��ʱ�׳��쳣��
				��һ����ʽ����һ������ֵ��null �� false������ȡ���ڲ�������
				��������ĺ�һ����ʽ��רΪʹ�����������Ƶ� Deque ʵ����Ƶģ��ڴ����ʵ���У������������ʧ�ܡ� 
				
				�±��ܽ������� 12 �ַ����� 
				
				 ��һ��Ԫ�أ�ͷ���� ���һ��Ԫ�أ�β���� 
				 �׳��쳣 ����ֵ �׳��쳣 ����ֵ 
				���� addFirst(e) offerFirst(e) addLast(e) offerLast(e) 
				�Ƴ� removeFirst() pollFirst() removeLast() pollLast() 
				��� getFirst() peekFirst() getLast() peekLast() 	

         */
		
		LinkedList<Float> list = new LinkedList<Float>();
		    float f = 87.8f;
		    int num = 12;
	        list.add(1.0f);
	        list.add(f); 
	        list.add(new Float(num));
	        list.addFirst(1.2f);
	        //list.add(0, 12.56f); //��ָ��������λ���ϲ����Ӧ��Ԫ�� add(Float f)�����ط���
	        //ȡ�����ͼ����е�����ʱ����Ҫ����ת��
	        //float number =  list.get(0);
	        //ͨ��getFirst()�Ϳ��Կ��ٻ�ȡ��һ������
	        float number1 = list.getFirst();
	        float number2 = list.getLast();
	        System.out.println(number1+" "+number2);
	           
	}
      
}

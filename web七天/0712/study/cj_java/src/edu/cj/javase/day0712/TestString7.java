package edu.cj.javase.day0712;

public class TestString7 {
    public static void main(String[] args) {
		
		/*
		 * �����ַ��������е�����(������0��ʼ)
		 * ����ȡ��������λ���϶�Ӧ���ַ�
		 * charAt(int index),����һ��char���͵�����
		 * 
		 * ��charAt()��������ķ���:
		 *   indexOf(��Ӧ���ַ�)
		 *   lastIndexOf(�������������һ�γ��ֵ��ַ�)
		 *   ��Ӧ�ķ�������Ϊint,���û�ҵ���Ӧ���ַ���ô���ؽ��Ϊ-1
		 *   
		 *   
		 *   ��ȡ���ַ����ķ���:
		 *      substring(int beginIndex):�ӿ�ʼָ��������λ�ÿ�ʼ��ȡ���ַ���һֱ�����һ���ַ�
		 *      ��ȡ�����ַ����ĳ���Ϊ ��ǰ�ַ���.length()-beginIndex
		 *       ��:  String s = "hello world!"
		 *          String ss = s.substring(2) ���ַ����ĳ���Ϊ s.length()-2
		 *          ss������Ϊ llo world!
		 *      substring(int beginIndex,int endIndex):�ӿ�ʼָ��������λ�ÿ�ʼ��ȡ���ַ���һֱ��endIndex
		 *      ��ȡ�����ַ����ĳ���Ϊ endIndex-beginIndex ,��Ӧ�����ַ���������endIndex��������Ӧ���ַ�   
		 *      
		 *      
		 *      �ָ��ַ����ķ���  split()
		 *      ���ڽ��ַ�������ĳ����Ӧ���ַ����зָ�,����һ���ַ�������
		 *      
		 *      toLowerCase()__תСд
		 *      toUpperCase��������ת��д
		 *      concat()�����ַ������ӷ���  ��ͬ�� "+"���ӷ�
		 *      
		 */
    	String s = "hello";
    	s = s.toUpperCase();
    	System.out.println(s); //HELLO?
    	
    	//s = s.concat(" world");
    	s+=" world";
    	System.out.println(s);
		
    }
}

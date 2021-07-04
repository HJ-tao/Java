package edu.cj.javase.day0712;

public class TestString4 {
    public static void main(String[] args) {
		String s = "hello world:)";
		int leng = s.length(); //��ȡ�ַ����ĳ���
		System.out.println(leng);
		/*
		 * �����ַ��������е�����(������0��ʼ)
		 * ����ȡ��������λ���϶�Ӧ���ַ�
		 * charAt(int index),����һ��char���͵�����
		 * 
		 * ��charAt()��������ķ���:
		 *   indexOf(��Ӧ���ַ�)
		 *   lastIndexOf(�������������һ�γ��ֵ��ַ�)
		 *   ��Ӧ�ķ�������Ϊint
		 */
		
		char ch = s.charAt(4);
		System.out.println("ch = "+ch);
		//���淽��indexOf����lastIndexOf������ʹ��
		int lastIndex = s.lastIndexOf('o');
		System.out.println("lastIndex = "+lastIndex);
		
		int index = s.indexOf('o');
		System.out.println("index = "+index);
	}
   
    /*
     * ��ϰ:
     *    1.ͨ����������һ���ַ���,���ʵ��ѭ�������õ����ַ����е�ÿһ���ַ�
     *    2.��д����ʵ�������ȡ4λ����6λ����֤�룬��֤���Դ�ַ���Ϊ:
     *       String src = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789������ѧ�ƿ�רҵ�ı�����������";
     *      ˼·:
     *          ��ȡ����������ַ�ʽ  
     *             1.java.lang���е� Math.random()���÷����õ���������һ��[0.0,1.0)
     *             2.java.util���е�Random���е�nextInt(int seed)     [0,seed)
     *             
     *          ͨ��charAt(int index)����ȡ   src�ж�Ӧ����λ���ϵ��ַ�
     *          
     *          
     *          ���õ��ĵ���char�ַ�ƴ�ӳ�String�������
     *          
     * 
     */
}

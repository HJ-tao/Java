package edu.cj.javase.day0712;

public class TestString3 {
    public static void main(String[] args) {
		String s = "hello world:)";
		String ss = new String("hello WorLd:)");
		/*
		 * ==��equals����������
		 * ==�Ƚϵ��ǵ�ַ�Ƿ���ͬ
		 * equals�����Ƚϵ��������Ƿ���ͬ
		 * equalsIgnoreCase�����ڱȽ��ַ��������ǿ��Ժ�����ĸ�Ĵ�Сд
		 */
		System.out.println(s==ss); //true or false ??
		System.out.println(s.equals(ss));  //true or false ??
		System.out.println(s.equalsIgnoreCase(ss));  //true or false ??
		
	}
   
}

package edu.cj.javase.day0712;

public class TestString5 {
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
		 */
		
		String s = "hello world!";
		String ss = s.substring(2);
		System.out.println(ss.length()+"\n"+ss);
		
		String sss = s.substring(2,8); //8-2 =6
		System.out.println(sss.length()+"\n"+sss);
		
		/*
		 * �Ӽ�������һ���ļ���������.��׺���� ��:Hello.java
		 * ��д�����жϸ��ļ��Ƿ�Ϊjava�ļ�
		 * 
		 */
		String file = "Hello.java";
		if(isJavaFile(file)){
			System.out.println(file+"��һ��javaԴ�ļ�");
		}else{
			System.out.println(file+"����һ��javaԴ�ļ�");
		}
	}
   
    public static boolean isJavaFile(String fileName){
    	boolean isJava = false;
    	String subName = fileName.substring(fileName.lastIndexOf("."));
    	System.out.println(subName);
    	if (".java".equalsIgnoreCase(subName)) {
			isJava = true;
		}
    	return isJava;
    }
}

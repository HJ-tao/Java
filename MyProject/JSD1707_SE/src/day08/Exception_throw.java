package day08;
/**
 * �����쳣���׳�
 * @author Random
 *	
 */
public class Exception_throw {

	public static void main(String[] args) {
		Person p = new Person();
		/*
		 * ������һ������throws�����쳣�׳��ķ���ʱ,��������Ҫ�������
		 * ������쳣���ֶ�,�����쳣�����ַ�ʽ:
		 * 1.ʹ��try-catch���񲢴���
		 * 2.�ڵ�ǰ��������ʹ��throws�������쳣���׳�
		 */
		try {
			p.setAge(200);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
		System.out.println(p.getAge());
	}

}

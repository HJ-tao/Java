package day09;
/**
 * �����쳣���׳�
 * @author adminitartor
 *
 */
public class Exception_throw {
	public static void main(String[] args) {
		Person p = new Person();
		/*
		 * ������һ������throws�����쳣�׳���
		 * ����ʱ,��������Ҫ������д�����쳣
		 * ���ֶ�,�����쳣�����ַ�ʽ:
		 * 1:ʹ��try-catch���񲢴���
		 * 2:�ڵ�ǰ��������ʹ��throws������
		 *   �쳣���׳�
		 */
		try {
			p.setAge(2000);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
	
		System.out.println(p.getAge());
		
		
	}
}



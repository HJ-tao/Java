package edu.cj.javase.day0710;

public class Demo2 {

	/**
	 * java�еİ��ֻ���������������:
	 * 1.byte  �ֽ���   -128~127 
	 * 2.char  �ַ���   ռ�����ֽ� �������ڴ洢һ������  �õ����� �� '��'
	 * 3.short ������
	 * 4.int   ����
	 * 5.long  ������
	 * 6.float �����ȸ�����
	 * 7.double ˫���ȸ�����
	 * 8.boolean ��������  ������� true or false ����ͼ�
	 * 
	 * ����boolean���Ͳ���������,���������ж�����������
	 * 
	 * ��java JDK5.0�й���ʦ�����������java�а��ֻ����������͵�����(����)���͡���������װ�ࡢ�����ࡢװ����
	 * 
	 * ������������			��װ��or������orװ����		
	 * 
	 * 1.byte  				Byte
	 * 2.char               Character
	 * 3.short              Short
	 * 4.int                Integer
	 * 5.long               Long
	 * 6.float              Float
	 * 7.double             Double
	 * 8.boolean            Boolean
	 * 
	 * ��װ�����ʵ�ֶԻ����������͡�����֮���ת������ǿ�����ݵ�ʹ�÷�Χ�������������Ի�����ʹ�ö�Ӧ�ķ���,��������������ֻ��
	 * ȥ���ö�Ӧ������ֵ
	 * ���Ұ�װ�໹�ṩ�˷ḻ�ķ���������ʵ������֮����໥ת��
	 * ͨ���õ��ķ����� parseXXX()
	 * XXX������ǳ���char֮����������ж�Ӧ�����ݵ�ת�����������������������Խ��ַ�������ͨ��parseXXX����ת��Ϊ������������
	 */
	public static void main(String[] args) {
		char sex = 'A';
		System.out.println((int)sex+"\n"+(sex+1));
		
		String s = "12345aaaa";
		int num1 ;
		try {
			num1 = Integer.parseInt(s);
			System.out.println(num1+1);
		} catch (NumberFormatException e) {
			System.out.println(s+"��������");
			//Ҳ�����ֶ����׳����쳣
			throw new RuntimeException(s+"��������");
		}
		

	}

}

package day02;
/**
 * JDK1.5֮���Ƴ���һ���µ�����:
 * �Զ���װ��
 * �������Ǳ������Ͽ�,���������.�������Ǳ������ڱ���Դ����ʱ�Զ������˻���������
 * ��װ��֮���ת������.�Ӷ��ǳ���Ա������Ϊ����֮�以ת����дת������.
 * @author soft01
 *
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		int ii = new Integer(23).intValue();
		Integer inn = Integer.valueOf(ii);
		/*
		 * �Զ�����
		 * �������Ჹ����뵽class�ļ���:
		 * int d = new Integer(123).intValue();
		 */
		int d = new Integer(123);
		/*
		 * �Զ�װ��
		 * �������Ჹ����뵽class�ļ���:
		 * Integer in = Integer.valueOf(d);
		 */
		Integer in = d;
	}
}

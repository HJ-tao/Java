package binary;
public class Demo1 {

	public static void main(String[] args) {
		/*
		 * i���ڴ��д洢����2��������
		 * java�������ڱ����ʱ��"50"
		 * ����(Integer.parseInt)Ϊ2���Ƶ�110010,�������ڼ�i��ֵ
		 * ��110010,�����ʱ��println���Զ���
		 * ���㷨(Integer.toString())
		 * ��������110010ת��Ϊ10�����ַ���"50"
		 * ��ʾ����.
		 */
		int i=50;
		//��ʾi���ڴ��е�2���ƴ洢���
		System.out.println(Integer.toBinaryString(i));
		System.out.println(i);
	}

}

package edu.cj.javase.day0710.work;

public class Work5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 123456; //��һҪ��
		int digit = 0; //������ȡ��Ӧλ���ϵ�����
		while (num!=0) //�ڶ�Ҫ�� 
		{
			//����Ҫ��
			digit = num%10;
			System.out.print(digit+ " ");
			//�ı�ѭ�������ĳ�ʼֵ ����Ӧ�ĵ���Ҫ��
			num = num/10;
		}

	}

}

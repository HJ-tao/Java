package edu.cj.javase.day0710.work;

public class Work6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1; //��һҪ��  
		int num1 = 1;
		int num2 = 1;
		System.out.print(num1+" "+num2+" ");
		while(i<=18)//�ڶ�Ҫ��  
		{
			//����Ҫ��  
			int num3 = num1 + num2;
			System.out.print(num3+" ");
			//��num2��ֵ������num1,Ȼ��num3��ֵ������num2
			num1 = num2; 
			num2 = num3;
			i++;
		}

	}

}

package edu.cj.javase.day0710.work;

public class Work3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 12345;
		//�ֱ�õ���ʮ��ǧ��
		int ge = num/1%10; //��λ������ 5
		System.out.println("ge="+ge);
		int shi = num/10%10; 
		System.out.println("shi="+shi);
		int bai = num/100%10; 
		System.out.println("bai="+bai);
		int qian = num/1000%10; 
		System.out.println("qian="+qian);
		int wan = num/10000%10; 
		
		System.out.println("wan="+wan);



	}

}

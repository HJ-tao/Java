package edu.cj.javase.day0711.work;

public class Work4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����������
		for (int i = 0; i < 30; i++) {
			//����������,�����ǵĸ���
			for (int j = 0; j < 40; j++) {
				System.out.print("*");
			}
			//ÿ�δ���һ�����Ǻ��ڻ���
			System.out.println();
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		char[][]star = new char[30][40];
		//��Ƕ��ѭ����ɶԶ�λ����Ԫ�صĸ�ֵ
		//����������
				for (int i = 0; i < star.length; i++) {
					//����������,�����ǵĸ���
					for (int j = 0; j < star[i].length; j++) {
						star[i][j] = '*';
					}
		
				}
        //ͨ��ѭ���������е�Ԫ�����������̨Ŷ
				for (int i = 0; i < star.length; i++) {
					//����������,�����ǵĸ���
					for (int j = 0; j < star[i].length; j++) {
						System.out.print(star[i][j]);
					}
					System.out.println();
				}	
	}

}

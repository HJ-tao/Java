package edu.cj.javase.day0711.work;

import java.util.Scanner;

public class Work2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//int sum = 0;
			//���ѭ�����ư༶������
			for (int i = 0; i < 2; i++) {
				int sum = 0;
				//�ڲ�ѭ������ÿ���༶��ѧ������
				int j = 0;
				for (; j < 2; j++) {
					System.out.print("�������"+(i+1)+"���༶�ĵ�"+(j+1)+"��ѧ���ĳɼ�:");
					int score = sc.nextInt();
					sum += score;
				}
				//�����Ӧ�༶��ѧ���ɼ���ƽ����
				System.out.printf("��%d���༶��%d��ѧ�����ܷ�Ϊ:%d,ƽ����Ϊ:%.2f\n",(i+1),j,sum,(float)sum/j);
			}

	}

}

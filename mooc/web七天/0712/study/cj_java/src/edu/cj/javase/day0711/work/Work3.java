package edu.cj.javase.day0711.work;

import java.util.Scanner;

public class Work3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[][]scores = new int[2][2];
			//���ѭ�����ư༶������
			for (int i = 0; i < scores.length; i++) {
				int sum = 0;
				//�ڲ�ѭ������ÿ���༶��ѧ������
				int j = 0;
				for (; j < scores[i].length; j++) {
					System.out.print("�������"+(i+1)+"���༶�ĵ�"+(j+1)+"��ѧ���ĳɼ�:");
					scores[i][j] = sc.nextInt();
					sum += scores[i][j];
				}
				//�����Ӧ�༶��ѧ���ɼ���ƽ����
				System.out.printf("��%d���༶��%d��ѧ�����ܷ�Ϊ:%d,ƽ����Ϊ:%.2f\n",(i+1),j,sum,(float)sum/j);
			}

	}

}

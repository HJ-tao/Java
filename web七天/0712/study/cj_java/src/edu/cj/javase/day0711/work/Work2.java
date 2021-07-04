package edu.cj.javase.day0711.work;

import java.util.Scanner;

public class Work2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//int sum = 0;
			//外层循环控制班级的数量
			for (int i = 0; i < 2; i++) {
				int sum = 0;
				//内层循环控制每个班级的学生人数
				int j = 0;
				for (; j < 2; j++) {
					System.out.print("请输入第"+(i+1)+"个班级的第"+(j+1)+"个学生的成绩:");
					int score = sc.nextInt();
					sum += score;
				}
				//计算对应班级的学生成绩的平均分
				System.out.printf("第%d个班级的%d名学生的总分为:%d,平均分为:%.2f\n",(i+1),j,sum,(float)sum/j);
			}

	}

}

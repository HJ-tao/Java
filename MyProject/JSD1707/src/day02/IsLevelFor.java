package day02;

import java.util.Scanner;

public class IsLevelFor {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		double score = 0;
		while(!flag){
			System.out.print("请输入该学员的分数：");
			score = sc.nextInt();
			if(score < 0||score > 100){
				flag = false;
				System.out.println("输入成绩超出范围！");
			}else{
				flag = true;
			}
		}
		char degree = ' ';
		switch((int)score/10)
		{
		   case 10:
		   case 9:{
			   degree = 'A';
			   break;
		   }
		   case 8:{
			   degree = 'B';
			   break;
		   }
		   case 7:
		   case 6:{
			   degree = 'C';
			   break;
		   }
		   default:
			   degree = 'D';
			   break;
		}
		System.out.println("等级为:"+degree);
	}

}

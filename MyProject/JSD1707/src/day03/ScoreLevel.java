package day03;

import java.util.Scanner;

public class ScoreLevel {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入成绩：");		
		int score = sc.nextInt();
		/*if(score<0 || score>100){
			System.out.println("输入成绩不合法.");
		}else if(score>=90){
			System.out.println("A--优秀");
		}else if(score>=80){
			System.out.println("B--良好");
		}else if(score>=60){
			System.out.println("C--一般");
		}else{
			System.out.println("D--不及格");
		}*/
		/*if(score>=0&&score<=100){
			if(score>=90){
				System.out.println("A--优秀");
			}else if(score>=80){
				System.out.println("B--良好");
			}else if(score>=60){
				System.out.println("C--一般");
			}else{
				System.out.println("D--不及格");
			}
		}else{
			System.out.println("输入成绩不合法.");
		}*/
		if(score<0||score>100){
			System.out.println("输入不合法.");
		}else{
			switch((int)(score/10)){
			    case 10:
			    case 9:
			    	System.out.println("A--优秀");
			    	break;
			    case 8:
			    	System.out.println("B--良好");
			    	break;
			    case 7:
			    case 6:
			    	System.out.println("C--一般");
			    	break;
			    default:
			    	System.out.println("D--不及格");
			    	break;		    
		    }
		}
		sc.close();
	}
}

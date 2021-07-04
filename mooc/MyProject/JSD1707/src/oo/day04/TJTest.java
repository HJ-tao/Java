package oo.day04;

import java.util.Scanner;

public class TJTest {
	public static void main(String[] args) {
		Tetromino t = new T(2,3);
		Scanner sc = new Scanner(System.in);
		printWall(t);
		do{
			System.out.println("1----下落  2----向左  3----向右  0----退出");
			int oper = sc.nextInt();
			if(oper==0){
				System.out.println("欢迎下次继续.");
				break;
			}
			switch(oper){
			   case 1:
				   t.drop();
				   printWall(t);
				   break;
			   case 2:
				   t.moveLeft();
				   printWall(t);
				   break;
			   case 3:
				   t.moveRight();
				   printWall(t);
				   break;
			   default:
				   System.out.println("输入错误.");
				   break;
			}
		}while(true);
	}
	
	public static void printWall(Tetromino t){
		for(int i=0;i<20;i++){  //遍历墙的行
			for(int j=0;j<10;j++){  //遍历墙的列
				boolean flag = true;   //设置开关
				for(int k=0;k<t.cells.length;k++){   //遍历图形的格子
					if(i==t.cells[k].row && j==t.cells[k].col){  //判断图形中的格子行号与列号是否和行,列值相同
						flag = false;   //满足则开关关闭
						break;   //一旦找到即可跳出循环,避免不必要的浪费
					}
				}
				if(flag){//判断开关状态,关闭则表示应当打印格子,反之为墙
					System.out.print("- "); 
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}

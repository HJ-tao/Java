package oo.day01;

import java.util.Scanner;

public class CellTest {

	public static void main(String[] args) {
		
		/*Cell c = new Cell();          //创建对象称为实例化
		c.row = 2;
		c.col = 5;
		c.drop();
		c.moveLeft(3);
		String str = c.getCellInfo();
		System.out.println(str);*/
		
		Cell c = new Cell();
		c.row = 15;
		c.col = 3;
		print(c);
		Scanner sc = new Scanner(System.in);
		int input = 0;
		do{
			System.out.println("1--下落   2--向左   3--向右   0--退出");
			input = sc.nextInt();
			switch(input){
				case 1:
					c.drop();
					print(c);
					break;
				case 2:
					c.moveLeft();
					print(c);
					break;
				case 3:
					c.moveRight();
					print(c);
					break;
				default:
					break;
			}
		}while(input!=0);
		System.out.println("再见!");
	}
	
	public static void print(Cell cc){
		System.out.println("Cell的位置为："+cc.getCellInfo());
		for(int i=0;i<20;i++){    //行
			for(int j=0;j<10;j++){    //列
				if(i==cc.row && j==cc.col){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}

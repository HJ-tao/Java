package oo.day01;

import java.util.Scanner;

public class Test {
	public static final int ROW = 10;
	public static final int COL = 15;

	public static void main(String[] args) {
		Cell c = new Cell(2,3);
		print(c);
		int point;
		do{
			System.out.println("请选择：1.下落一格;2.左移一格;3.右移一格;");
			Scanner sc = new Scanner(System.in);
			point = sc.nextInt();
			switch(point){
				case 1:
					System.out.println("-----下落一格-----");
					c.drop();
					System.out.println(c.getCellInfo());
					print(c);
					break;
				case 2:
					System.out.println("-----左移一格-----");
					c.moveLeft();
					System.out.println(c);
					print(c);
					break;
				case 3:
					System.out.println("-----右移一格-----");
					c.moveRight();
					System.out.println(c);
					print(c);
					break;
				default:
					break;
			}
		}while(point!=0);
	}
	
	public static void print(Cell c){
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				if(i==c.row && j == c.col){
					System.out.print("*");
				}else{
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

}

package oo.day03;

public class TJTest {
	public static void main(String[] args) {
		Tetromino t = new Z(2,3);
		printWall(t);
		
		J m = new J(7,8);
		printWall(m);
	}
	
	public static void printWall(Tetromino t){   //原方法
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				boolean flag = true;
				for(int k=0;k<t.cells.length;k++){
					if(t.cells[k].row==i && t.cells[k].col==j){
						flag = false;
						break;
					}
				}
				if(flag){
					System.out.print("- ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	
	/*public static void printWall(Tetromino t){
		boolean[][] flags = new boolean[100][100];
		for(int i=0;i<t.cells.length;i++){
			flags[t.cells[i].row][t.cells[i].col] = true; 
		}
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
				if (flags[i][j]) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}*/

}

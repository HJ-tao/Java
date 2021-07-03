package oo.day01;

public class Test1 {
	public static void main(String []args){
		Cell1 c = new Cell1();
		print(c);
		Cell1 cc = new Cell1(3);
		print(cc);
		Cell1 ccc = new Cell1(3,4);
		print(ccc);
	}
	
	public static void print(Cell1 cell){
		System.out.println("坐标："+cell.getCellInfo());
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				if(cell.row==i && cell.col==j){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}

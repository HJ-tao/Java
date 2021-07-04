package oo.day02;

public class Test {
	public static void main(String []args){
		Cell c = new Cell(1,2);
		Cell cc = new Cell(3);
		Cell ccc = new Cell();
		print(c);
		print(cc);
		print(ccc);
		System.out.println((int)Short.MAX_VALUE);
		System.out.println('\u1234');
	}
	
	public static void print(Cell c){
		String str = c.getCellInfo();
		System.out.println("坐标为:"+str);
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				if(c.row==i && c.col==j){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}

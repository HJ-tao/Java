package mypackage;

public class CellGame {
	public static void printCell(Cell cell){
		int totalRow = 20;
		int totalCol = 10;
		for(int row = 0;row<totalRow;row++){
			for(int col = 0;col<totalCol;col++){
				if(cell.row == row && cell.col == col){
					System.out.print("*");
				}
				else{
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("----------绘制Cell--------------");
		Cell cell = new Cell();
		cell.row = 15;
		cell.col = 6;
		printCell(cell);
		System.out.println("-----------测试下落--------------");
		cell.drop();
		printCell(cell);
	}
}

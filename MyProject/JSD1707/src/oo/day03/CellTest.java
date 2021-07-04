package oo.day03;

public class CellTest {

	public static void main(String[] args) {
		Cell[] cells = new Cell[4];
		cells[0] = new Cell(1,2);
		cells[1] = new Cell(2,2);
		cells[2] = new Cell(7,6);
		cells[3] = new Cell(4,5);
		
		Cell[] cs = new Cell[]{
				new Cell(1,2),
				new Cell(2,2),
				new Cell(7,6),
				new Cell(4,5)
		};
		
		int[][] arr = new int[4][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[2];
		arr[3] = new int[4];
		
		int[][] arr1 = new int[3][4];
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				arr1[i][j] = 100;
			}
		}
 	}
	
	public static void print(Cell c){
		System.out.println("坐标为:"+c.getCellInfo());
	}

}

package oo.day04;

public class L extends Tetromino{
	L(){
		this(0,0);
	}
	
	L(int row,int col){
		cells[0] = new Cell(row,col);
		cells[1] = new Cell(row+1,col);
		cells[2] = new Cell(row+2,col);
		cells[3] = new Cell(row+2,col+1);
	}
}

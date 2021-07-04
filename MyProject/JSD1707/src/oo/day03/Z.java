package oo.day03;

public class Z extends Tetromino{
	Z(){
		this(0,0);
	}
	
	Z(int row,int col){
		cells[0] = new Cell(row,col);
		cells[1] = new Cell(row,col+1);
		cells[2] = new Cell(row+1,col+1);
		cells[3] = new Cell(row+1,col+2);
	}
}

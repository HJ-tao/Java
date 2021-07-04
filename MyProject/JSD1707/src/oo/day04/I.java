package oo.day04;

public class I extends Tetromino{
	I(){
		this(0,0);
	}
	
	I(int row,int col){
		for(int i=0;i<cells.length;i++){
			cells[i] = new Cell(row+i,col);
		}
	}
}

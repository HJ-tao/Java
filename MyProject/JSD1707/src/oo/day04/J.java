package oo.day04;

public class J extends Tetromino{
	J(){
		this(0,0);
	}
	
	J(int row,int col){
		cells[0] = new Cell(row,col);
		cells[1] = new Cell(row+1,col);
		cells[2] = new Cell(row+2,col-1);
		cells[3] = new Cell(row+2,col);
	}
	
	void print(){
		System.out.println("J型:");
		super.print();
	}
}

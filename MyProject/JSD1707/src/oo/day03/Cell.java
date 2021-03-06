package oo.day03;

public class Cell {
	int row;
	int col;
	
	Cell(){
		this(0,0);
	}
	
	Cell(int n){
		this(n,n);
	}
	
	Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	
	void drop(){
		row++;
	}
	
	void drop(int n){
		row+=n;
	}
	
	void moveLeft(){
		col--;
	}
	
	void moveLeft(int n){
		col-=n;
	}
	
	void moveRight(){
		col++;
	}
	
	void moveRight(int n){
		col+=n;
	}
	
	String getCellInfo(){
		return "("+row+","+col+")";
	}
	
}

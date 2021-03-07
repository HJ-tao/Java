package oo.day01;

public class Cell1 {
	int row;
	int col;
	
	Cell1(){
		this(0,0);
	}
	
	Cell1(int n){
		this(n,n);
	}
	
	Cell1(int row,int col){
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

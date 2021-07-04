package oo.day01;

public class Cell {
	int row;//行号
	int col;//列号
	
	Cell(){
		this(0,0);
	}
	
	Cell(int x,int y){
		row = x;
		col = y;
	}
	
	void drop(){//下落一格
		row++;
	}
	
	void moveLeft(int n){
		col-=n;
	}
	
	void moveLeft(){ //左移一格
		col--;
	}
	
	void moveRight(int n){
		col+=n;
	}
	
	void moveRight(){//右移一格
		col++;
	}
	
	String getCellInfo(){//获取格子的行号和列号
		return "("+row+", "+col+")";
	}
	
}

package oo.day02;

public class Cell {
	int row;
	int col;
	
	Cell(){//无参构造方法
		this(0,0);
	}
	
	Cell(int n){//一个参数构造方法
		this(n,n);
	}

	Cell(int row,int col){//两个参数构造方法
		this.row = row;
		this.col = col;
	}
	
	void drop(){//下落1格
		row++;
	}
	
	void drop(int n){//下落n格
		row+=n;
	}
	
	void moveLeft(){//左移1格
		col--;
	}
	
	void moveLeft(int n){//左移n格
		col-=n;
	}
	
	void moveRight(){//右移1格
		col++;
	}
	
	void moveRight(int n){//右移n格
		col+=n;
	}
	
	String getCellInfo(){
		return row+","+col;
	}
}

package oo.day04;

public class Cell {
    int row;
	int col;
	
	Cell(){//无参构造方法
		this(0,0);//调用两个参数的构造方法
	}
	
	Cell(int n){//含有一个参数的构造方法
		this(0,0);
	}
	
	Cell(int row,int col){//含有两个参数的构造方法
		this.row = row;  //this指代该类的对象
		this.col = col;
	}
	
	String getCellInfo(){//输出表格的行和列
		return "("+row+","+col+")";
	}
}

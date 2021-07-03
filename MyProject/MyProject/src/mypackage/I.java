package mypackage;

public class I {
	Cell []cells;
	//无参构造方法
	public I(){
		this(0,0);
	}
	//有参构造方法
	public I(int row,int col){
		cells = new Cell[4];
		cells[0] = new Cell(row,col);
		cells[1] = new Cell(row,col+1);
		cells[2] = new Cell(row,col+2);
		cells[3] = new Cell(row,col+3);
	}
	//无参下落
	public void drop(){
		for(int i = 0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	//有参下落
	public void drop(int d){
		for(int i = 0;i<cells.length;i++){
			cells[i].row+=d;
		}
	}
	//无参左移
	public void moveLeft(){
		for(int i = 0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	//有参左移
	public void moveLeft(int d){
		for(int i = 0;i<cells.length;i++){
			cells[i].col-=d;
		}
	}
	//无参右移
	public void moveRight(){
		for(int i = 0;i<cells.length;i++){
			cells[i].col++;
		}
	}
	//有参右移
	public void moveRight(int d){
		for(int i = 0;i<cells.length;i++){
			cells[i].col+=d;
		}
	}
	//打印输出
	public void print(){
		String str = "";
		for(int i=0;i<cells.length;i++){
			str += "("+cells[i].getCellInfo()+"),";
		}
		str = str.substring(0, str.length()-1);
		System.out.println(str);
	}
}

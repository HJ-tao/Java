package mypackage;

public class Tetromino {
	Cell []cells;
	
	public Tetromino(){
		cells = new Cell[4];
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

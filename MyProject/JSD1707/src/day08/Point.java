package day08;

public class Point<E> {
	private E x;
	private E y;

	public boolean equals(Object obj){//重写Object的equals方法
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Point){
			Point p = (Point)obj;
			return p.x==this.x&&p.y==this.y;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}


	public E getX() {
		return x;
	}

	public void setX(E x) {
		this.x = x;
	}

	public E getY() {
		return y;
	}

	public void setY(E y) {
		this.y = y;
	}

	public Point(E x, E y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

package collection.other;

/**
 * 使用该类来测试作为集合的元素进行排序
 *
 */
public class Point implements Comparable<Point> {//添加Comparable接口时,需要将Comparable泛型设为类名
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	/*
	 * 当一个类实现了Comparable接口后,接口要求必须重写方法CompareTo(),该方法的作用是定义当前对象与参数给定
	 * 对象比较大小的规则.
	 * 方法要求返回一个整数,该整数不关注具体值,只关注取值范围,即:
	 * 当返回值大于0,当前对象大于参数对象(this>Point o)
	 * 当返回值小于0,当前对象小于参数对象
	 * 当返回值等于0,当前对象等于参数对象
	 * 
	 */
	@Override
	public int compareTo(Point o) {  
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y*o.y;
		return len-olen;
	}
	
	

}

package string.demo;
/**
 * 使用该类实现重写Object类
 * @author soft01
 *  包装类自带int的最大值和最小值属性
 * int 包装类 Integer 
 * char 包装类 Character
 */
public class ObjectDemo {

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p);//输出obj时，默认输出Obj的toString方法
		p.setX(1);
		p.setY(2);
		String s = p.toString();
		System.out.println(s);
		int iMax = Integer.MAX_VALUE;
		int iMin = Integer.MIN_VALUE;
		System.out.println(iMax+" \n"+iMin);
		double m = Double.parseDouble("123.13");
		System.out.println(m);
		
		Integer i1 = Integer.valueOf(128);
		Integer i2 = Integer.valueOf(128);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
	}

}

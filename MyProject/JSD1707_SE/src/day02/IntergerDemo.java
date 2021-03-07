package day02;
/**
 * 包装类
 * java有8个基本类型,由于他们不是引用类型,不具有面向对象特性,所以不能直接参与面向对象的开发.
 * 为此java对着8个基本类型分别提供了对应的包装类来解决该问题.
 * @author soft01
 *
 */
public class IntergerDemo {

	public static void main(String[] arg) {
		/**
		 * 基本类型转换为包装类时不建议采取new的形式,而应当使用包装类的静态方法:valueOf
		 * 
		 */
		Integer i = Integer.valueOf(-128);
		Integer ii = Integer.valueOf(-128);
		
		System.out.println(i==ii);
		System.out.println(i.equals(ii));
		
		int ia = i.intValue();
		System.out.println(ia);
		
		Double dou = Double.valueOf(23.343);
		double d = dou.doubleValue();
		System.out.println(d);
		
		Boolean b = Boolean.valueOf(true);
		boolean bs = b.booleanValue();
		System.out.println(bs);
		
		Byte be = Byte.valueOf((byte)23);
		byte m = be.byteValue();
		System.out.println(m);
		
		double mm = Math.hypot(3,4);
		System.out.println(Math.cos(Math.PI/4));
		System.out.println(Math.sin(Math.PI/4));
		System.out.println(Math.cos(Math.PI/4)==Math.sin(Math.PI/4));
	}

}

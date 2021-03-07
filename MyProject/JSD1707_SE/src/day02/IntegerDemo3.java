package day02;
/**
 * JDK1.5之后推出了一个新的特性:
 * 自动拆装箱
 * 该特性是编译器认可,而非虚拟机.该特性是编译器在编译源代码时自动补充了基本类型与
 * 包装类之间的转换代码.从而是程序员不用再为两者之间互转而编写转换代码.
 * @author soft01
 *
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		int ii = new Integer(23).intValue();
		Integer inn = Integer.valueOf(ii);
		/*
		 * 自动拆箱
		 * 编译器会补充代码到class文件中:
		 * int d = new Integer(123).intValue();
		 */
		int d = new Integer(123);
		/*
		 * 自动装箱
		 * 编译器会补充代码到class文件中:
		 * Integer in = Integer.valueOf(d);
		 */
		Integer in = d;
	}
}

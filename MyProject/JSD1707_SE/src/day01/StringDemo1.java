package day01;
/**
 * 字符串常量池
 * java对字符串有一个优化措施,即:JVM在堆内存中创建了一段区域--字符串常量池,用来缓存曾经通过字面量吸纳格式创建
 * 过得字符串对象.一旦使用曾经创建过得字符串字面量创建对象时,会直接重用常量池中的该对象而不是再重新创建.这样可
 * 以避免因大量使用内容一样的字符串对内存的大量开销.
 * 但也因此,java要求字符串是不变对象.即:字符串对象创建后其内容不可改变,改变一定创建新字符串对象.
 * @author soft01
 *
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String s1 = "alla";
		String s2 = "alla"; //重用s1对象
		String s3 = "alla";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		s2 = s2+"/";
		System.out.println(s2);
		System.out.println(s1);//s1不再引用原对象,所以s1不再与s2相等
		System.out.println(s1==s2);
	}
}

package string.demo;

public class StringDemo2 {

	public static void main(String[] args) {
		/**
		 * 由于String在java中的优化倾向与重用型，
		 * 这就导致频繁的修改字符串对于性能的损耗
		 * 是非常可观的。为此，java提供了一个专门用来修改字符串
		 * 内容的类：StringBuilder
		 * StringBuilder内部维护一个可变的数组，所有操作
		 * 均在数组中完成.速度快，内存损耗小.
		 * StringBuilder提供了一套用于修改字符串内容的方法。
		 * 所以在实际开发中，所有修改字符串操作都应当使用
		 * StringBuilder来完成.
		 * append:在末尾添加字符串;
		 * replace(start,end,str):替换字符串;
		 * delete(start,end):删除字符串;
		 * insert(index,str):在指定位置插入字符串;
		 * 
		 * 
		 * StringBuffer是线程安全的，同步处理的，性能稍慢
		 * StringBuilder是非线程安全的，并发处理的，性能稍快
		 */
		
		
		/*String s1 = "Good Good Study!";
		long a = System.currentTimeMillis();
		for(int i =0;i<1000;i++){
			s1 += "Day Day Up!";
		}
		long b = System.currentTimeMillis();
		System.out.println(b-a);
		StringBuffer buffer = new StringBuffer(s1);
		a = System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			buffer.append("Day Day Up!");
		}
		s1 = buffer.toString();
		b = System.currentTimeMillis();
		
		System.out.println(b-a);*/

		/**
		 * boolean startsWith(String s)
		 * boolean endsWith(String s)
		 * String toUpperCase()
		 * String toLowerCase()
		 * valueOf(int,double,char,short,long,boolean,float,byte)
		 */
		String st = "hello.java";
		StringBuilder sb = new StringBuilder(st);
		sb.replace(0, 3, "one");  //返回值调用的StringBuilder
		System.out.println(sb);
		sb.delete(1, 2);
		System.out.println(sb);
		boolean start = st.startsWith("old");//判断字符串的前缀是否匹配
		boolean end = st.endsWith("java");//判断字符串的后缀是否匹配
		System.out.println("start:"+start);
		System.out.println("end:"+end);
		String upper = st.toUpperCase();//将英文部分全用大写表示
		String lower = upper.toLowerCase();//将英文部分全用小写表示
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(String.valueOf(124)+1);//valueof是字符串的静态方法，可以将其他类型的值转为字符串类型
	}

}

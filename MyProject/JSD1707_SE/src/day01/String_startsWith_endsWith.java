package day01;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是以指定字符串开始或结束的
 * @author soft01
 *
 */
public class String_startsWith_endsWith {

	public static void main(String[] args) {
		String str = "thinking in java";
		
		boolean starts = str.startsWith("thi");
		System.out.println("starts:"+starts);
		
		boolean ends = str.endsWith("java");
		System.out.println("ends:"+ends);
	}

}

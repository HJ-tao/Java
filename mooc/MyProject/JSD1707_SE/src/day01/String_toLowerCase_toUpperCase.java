package day01;
/**
 * String toLowerCase()
 * String toUpperCase()
 * 将当前在字符串中的英文部分转换为全大写和全小写
 * @author soft01
 *
 */
public class String_toLowerCase_toUpperCase {

	public static void main(String[] args) {
		String str = "java阿里解放啦";
		
		String upper = str.toUpperCase();
		System.out.println(upper);
		
		String lower = str.toLowerCase();
		System.out.println(lower);
		
	}

}

package day02;
/**
 * 
 * @author soft01
 *
 */
public class Test2 {

	public static void main(String[] args) {
		String regex = "(wqnmlgb|cnm|nc|tmd|mdzz|mmp|djb|sb)";
		String message = "wqnmlgb!�����nc!����ô��ôsb!mdzz!";
		message = message.replaceAll(regex, "*****");
		System.out.println(message);
	}

}

package day01;
/**
 * char charAt(int index)
 * 返回当前字符串中给定位置的字符
 * @author soft01
 *
 */
public class String_charAt {

	public static void main(String[] args) {
		String str = "thinking in java";
		char c = str.charAt(9);
		System.out.println(c);
		
		str = "上海自来水来自海上";
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				System.out.print("不");
				break;
			}
		}
		System.out.println("是回文.");
		
	}

}

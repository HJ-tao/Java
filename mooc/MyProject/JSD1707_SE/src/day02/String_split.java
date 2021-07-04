package day02;
/**
 * String支持正则表达式方法二:
 * String[] split(String regex)
 * 将当前字符串的内容按照满足正则表达式的部分进行拆分,将拆分后的若干段字符串
 * 存入一个数组后返回
 * @author soft01
 *
 */
public class String_split {

	public static void main(String[] args) {
		String str = "alb12lala324lsjfl89";
		/*
		 * 若在拆分的过程中发现连续匹配了拆分部分,那么会在中间拆除一个空字符串.
		 * 但是若在字符串末尾连续匹配,则所有差分空字符串会被忽略.
		 */
		String[] ss = str.split("\\d");
		System.out.println(ss.length);
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		}
	}

}

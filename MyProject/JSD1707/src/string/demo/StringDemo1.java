package string.demo;
/**
 * int indexOf(String s)
 * int indexOf(String s,int index)
 * int lastIndexOf(String s)
 * String subString(int start)
 * String subString(int start,int end)
 * String trim()
 * Char charAt(int index)
 * @author soft01
 *
 */
public class StringDemo1 {

	public static void main(String[] args) {
		String str = "www.oracle.com.cn";
		String name;
		int index = 0;
		index = str.indexOf("oracle");//获取源字符串中第一次出现所需字符的位置
		System.out.println(index);
		index = str.indexOf("o",5);//获取源字符串中从索引5以后第一次出现字符的位置
		System.out.println(index);
		index = str.lastIndexOf("o");//获取源字符串中最后一次出现字符的位置
		System.out.println(index);
		name = str.substring(4);//获取源字符串从某个索引开始到最后的字符串
		System.out.println(name);
		name = str.substring(4,10);//获取源字符串从开始索引到末尾索引的字符串，不包括末尾索引的字符
		System.out.println(name);
		name = getHost("www.baidu.com");
		System.out.println(name);
		name = getHost("http://www.baidu.com.cn");
		System.out.println(name);
		name = getHost("http://www.tedu.cn");
		System.out.println(name);
		String s1 = "             hello  " ;
		System.out.println(s1.trim());//去除字符串两边的空白字符
		System.out.println(str.charAt(4));//产生该索引对应的字符
		String info = "上海自来水来自海上";
		for(int i=0;i<info.length()/2;i++){
			if(info.charAt(i)!=info.charAt(info.length()-1-i)){
				System.out.println("不是回文.");
				return;//方法返回
			}
		}
		System.out.println("是回文.");
	}
	public static String getHost(String url){
		int start = url.indexOf(".")+4;
		int end = url.indexOf('.', start);
		return url.substring(start,end);
	}

}

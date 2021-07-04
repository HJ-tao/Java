package string.demo;
//正则表达式
/**
 *    []:表示一个字符;
 *    ():表示一个整体;
 * (a|c):表示a或c;
 *     .:表示任意字符;
 *    \d:表示任意一个数字;
 *    \s:表示空白字符;
 *    \w:表示单词字符(\t\n\xOB\f\r)
 *    x?: 表示0或1个;
 *    x*: 表示0到任意多个;
 *    x+: 表示1到任意多个;
 *  x{n}:表示个数为n;
 * x{a,}:表示大于a个;
 *x{a,b}:表示a到b个;
 * 
 * boolean matches(String regex)
 * String支持字符串匹配的相关方法
 *
 * String[] split(String regex)
 * 将字符串按照regex进行拆分,形成字符串数组(匹配部分删除)
 */
public class StringDemo3 {

	public static void main(String[] args) {
		String regex = "[\u4e00-\u9fa5]+";
		String regex1 = "\\w+@[a-zA-z]+(\\.[a-zA-Z]+)+";//\w表示正则表达式中的特殊意义，\在java中需要\转义
		String demo = "你好";
		String demo1 = "1332@qq.com.cn";
		String demo2 = "123abdc23bal34lajl342lajl34";
		System.out.println(demo.matches(regex));
		System.out.println(demo1.matches(regex1));
		String[] strArr = demo2.split("[a-z]+");//匹配字符两边如果没有不同与匹配的字符则用空格代替
		                                       //末尾连续匹配空串舍弃
		System.out.println(strArr.length);
		for(int i=0;i<strArr.length;i++){
			System.out.println(strArr[i]);
		}
		String imgName = "123.jpg";
		String[] names = imgName.split("\\.");
		imgName = System.currentTimeMillis()+"."+names[1];
		System.out.println(imgName);
	}

}

package edu.cj.javase.day0710;

public class Demo1 {

	/**
	 * java中的三种注释:
	 *    1.文档注释 格式: /** */
	 /*
           2.java中的多行注释 对应的快捷方式为选中要注释的代码后按下 ctrl+shift+/   即可
             取消则按下 ctrl+shift+\即可 
           3.单行注释  对应的快捷方式为在对应的代码行按下 ctrl+/ 即可，再按一次则取消改行的注释
           
           常用的快捷方式还会用到内容助手  alt+/ 可以实现实时提示
           比如  键入syso再按下alt+/ 就会得到   System.out.println();
          键入main再按下alt+/ 就会得到 main方法
          
          main方法的四要素:  public  static void main(字符串数组){}
          
          java中的转义字符:
              1. \n
              2. \t
              3. \\
              4. \b
              5. \'
              6. \"
              7. \r
              8. ...
            对比HTML中的特殊符号 &lt;  &gt;  &quot; &copy;   在xml文件中会使用比较多  
	 */
	public static void main(String[] args) {
		//
		String s = "hello";
		System.out.println("哈哈,长江大学不错哦,计科的宝宝们很可爱!");
		System.out.println("&&&&&&&&&&");
	}

}

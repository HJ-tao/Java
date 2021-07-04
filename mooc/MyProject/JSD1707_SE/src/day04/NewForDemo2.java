package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用新循环遍历
 * @author soft01
 *
 */
public class NewForDemo2 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		/*
		 * 新循环并非新的语法,JVM并不认可新循环.新循环是编译器认可的,当编译器发现在使用新循环遍历集合时,会将代码改变为使用迭代器遍历.
		 * 所以使用新循环遍历集合的过程中是不能通过集合的方法增删元素的.
		 */
		for(Object o:c){
			String str = (String)o;
			System.out.println(str);
			if("#".equals(str)){
				c.remove(str);//删除后,下次遍历会抛出异常
			}
		}
	}

}

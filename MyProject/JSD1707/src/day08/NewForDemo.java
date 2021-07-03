package day08;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强for循环
 * 又称为：新循环,for each
 * 作用是遍历集合或数组
 * 所以新循环不取代传统for循环的工作
 * @author soft01
 * 新循环并非新的语法，JVM并不认识
 * 新循环，而是编译器认可.
 * 编译器在编译源程序时发现，并使用新
 * 循环遍历集合时会将其改为使用迭代器
 * 遍历.
 *
 */
public class NewForDemo {

	public static void main(String[] args) {
		String[] arr = {"one","two","three","four"};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(String str:arr){
			System.out.print(str+"\t");
		}
		System.out.println();
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		
		for(Object o:c){
			String str = (String)o;
			System.out.print(str+"\t");
		}
	}

}

package collection.work1;

import java.util.Collection;
import java.util.ArrayList;

public class Work1 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		c1.add("one");
		c1.add("two");
		c1.add("three");
		c1.add("fice");
		System.out.println("c1为:"+c1);
		System.out.println("c1的大小为:"+c1.size());
		
		c1.remove("fice");
		System.out.println("去除fice之后:"+c1);
		
		boolean f = c1.contains("six");
		System.out.println("集合包含six:"+f);
		
		Collection<String> c2 = new ArrayList<String>();
		c2.add("ten");
		c2.add("nine");
		c2.add("two");
		System.out.println("c2为:"+c2);
		
		c1.addAll(c2);
		System.out.println("c1加上c2之后为:"+c1);
		
		Collection<String> c3 = new ArrayList<String>();
		c3.add("nine");
		c3.add("one");
		System.out.println("c3为:"+c3);
		c1.removeAll(c3);
		System.out.println("c1去除和c3共有的之后为:"+c1);
		
		boolean bo = c1.containsAll(c2);
		System.out.println("c1中包含c2所有元素:"+bo);
		
		c1.clear();
		boolean f1 = c1.isEmpty();
		System.out.println("c1清除后为空:"+f1);
	}

}

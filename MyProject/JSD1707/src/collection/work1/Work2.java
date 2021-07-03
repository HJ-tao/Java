package collection.work1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Work2 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("one");
		list1.add("three");
		list1.add("five");
		list1.add("seven");
		System.out.println("集合list1为:"+list1);
		
		String str = list1.get(1);
		System.out.println("第二个元素为:"+str);
		
		list1.set(1, "two");
		System.out.println("更改后的集合list1为:"+list1);
		
		list1.add(2, "three");
		list1.add(3, "four");
		list1.add(5, "six");
		System.out.println("添加元素后的list1为:"+list1);
		
		list1.remove(list1.size()-1);
		System.out.println("移除最后一个元素后list1为:"+list1);
		
		List<String> list2 = list1.subList(1, 4);
		System.out.println("截取的集合list2为:"+list2);
		
		
		System.out.print("通过迭代器输出list1:");
		Iterator<String> it = list1.iterator();
		while(it.hasNext()){
			String str1 = it.next();
			System.out.print(str1+",");
			if("#".equals(str1)){
				it.remove();
			}
		}
		
		Collections.sort(list1);
		System.out.println("\n排序后的list1为:"+list1);
	}
}

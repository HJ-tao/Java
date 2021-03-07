package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一堆重载add,remove的方法
 * 也可以通过下标操作元素
 * @author soft01
 *
 */
public class List_add_remove {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * [one,2,two,three,four]
		 */
		list.add(1,"2");
		System.out.println(list);
		/*
		 * [one,2,three,four]
		 */
		String old = list.remove(2);
		System.out.println(list);
		System.out.println("被删除元素:"+old);
	}

}

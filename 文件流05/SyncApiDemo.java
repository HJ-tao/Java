package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 将集合或Map转换为线程安全的
 * @author adminitartor
 *
 */
public class SyncApiDemo {
	public static void main(String[] args) {
		/*
		 * ArrayList,LinkedList都不是
		 * 线程安全的
		 */
		List<String> list 
			= new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * 将给定List转换为线程安全的
		 */
		list = Collections.synchronizedList(list);
		System.out.println(list);
		
		//HashSet也不是线程安全的
		Set<String> set 
			= new HashSet<String>(list);
		System.out.println(set);
		//将给定的Set集合转换为线程安全的
		Collections.synchronizedSet(set);
		System.out.println(set);
		
		/*
		 * HashMap也不是线程安全的
		 */
		Map<String,Integer> map
			= new HashMap<String,Integer>();
		map.put("语文", 88);
		map.put("数学", 98);
		map.put("英语", 89);
		System.out.println(map);
		//将给定Map转换为线程安全的
		map = Collections.synchronizedMap(map);
		System.out.println(map);
		
		
		/*
		 * API文档也有说明:
		 * 线程安全的集合也不与迭代器操作互斥.
		 * 所以在使用迭代器遍历集合时要自行维护
		 * 与集合增删元素等操作的互斥关系.否则
		 * 迭代器遍历过程中其他线程对集合元素
		 * 进行了变动,迭代器遍历会抛出异常.
		 * 
		 */
		
	}
}





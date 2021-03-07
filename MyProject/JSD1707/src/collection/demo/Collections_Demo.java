package collection.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Collections是集合的工具类,提供了很多便于操作集合的方法
 * 
 * static void sort(List list)
 * 对给定的List集合进行自然排序(从小到大)
 *
 */

public class Collections_Demo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		Random random = new Random();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}

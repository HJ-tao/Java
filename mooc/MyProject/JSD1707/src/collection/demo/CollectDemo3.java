package collection.demo;

/**
 * 迭代器也支持泛型，泛型的类型应当与其遍历的集合指定的泛型一致
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectDemo3 {

	public static void main(String[] args) {
		Collection<String> s = new ArrayList<String>();
		s.add("one");
		s.add("two");
		s.add("three");
		
		for(String str:s){
			System.out.println(str);
		}
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
			if("#".equals(str)){
				it.remove();
			}
		}
	}

}

package collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


/**
 * boolean remove(E e)
 * 将给定元素从集合中删除，成功返回true
 * 将给定元素与集合中现有元素顺序进行equals比较，
 * 然后删除与给定元素equals比较为true的.若有多个
 * 仅删除一个.
 * 
 * boolean addAll(Collection c)
 * 将给定集合中的所有元素添加到当前集合中,添加后当前集合发生变化则返回true
 * 
 * boolean containsAll(Collection c)
 * 判断当前集合是否包含给定集合中的所有元素
 * 
 * boolean removeAll(Collection c)
 * 删除当前集合与给定集合中的共有元素
 * @author soft01
 *
 */
public class CollectDemo2 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		Point<Integer> p = new Point<Integer>(1,2);
		c.add(new Point<Integer>(1,2));
		c.add(new Point<Integer>(2,2));
		c.add(new Point<Integer>(3,2));
		System.out.println(p.getX());
		
		Point<Double> p1 = new Point<Double>(1.1,2.2);
		System.out.println(p1.getY());
		c.remove(p);
		System.out.println(c);
		
		Collection c1 = new HashSet();
		c1.add("C");
		c1.add("C++");
		System.out.println(c);
		
		Collection c2 = new ArrayList();
		c2.add("java");
		c2.add("C#");
		c2.add("PHP");
		c2.add("C");
		
		c2.addAll(c1);
		System.out.println(c2);
		
		Collection c3 = new ArrayList();
		c3.add("C++");
		c3.add("C");
		c3.add("IOS");
		
		boolean contains = c2.containsAll(c3);
		System.out.println("全部包含："+contains);
		
		c2.removeAll(c3);
		System.out.println(c2);
		
	}

}

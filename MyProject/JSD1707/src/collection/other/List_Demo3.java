package collection.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序含有自定义元素的集合
 * Java提供的数据类型基本都实现了Comparable
 */
public class List_Demo3 {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(1,2));
		list.add(new Point(2,7));
		list.add(new Point(3,8));
		list.add(new Point(4,2));
		list.add(new Point(1,5));
		/*
		 * Collections.sort(List list)
		 * 该方法要求集合中的元素必须可以比较大小.即:元素必须实现Comparable接口
		 * 上述方法实际上排序自定义元素的集合时对我们的代码是有"侵入性"的
		 * 所谓侵入性即 :
		 * 当我们需要使用某个功能,而该功能要求我们为其修改代码,修改的越多侵入性
		 * 就越强.
		 * 侵入性带来的弊端是一旦该功能不再需要时,之前修改的代码都不具意义.增加
		 * 后期维护代码成本.
		 */
		Collections.sort(list);
		System.out.println(list);
		
		//排序字符串
		List<String> list1 = new ArrayList<String>();
		list1.add("Andy");
		list1.add("bob");
		list1.add("Cindy");
		list1.add("Gerogy");
		list1.add("zoom");
		System.out.println(list1);  
		Collections.sort(list1);   //String排序按照Unicode编码从第一个字母开始排序.
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("张三");
		list2.add("王二麻子");
		list2.add("李大富");
		System.out.println(list2);
		/*
		 * Collections提供了一个重载的sort方法,该方法要求提供一个额外的比较规则,
		 * 该比较规则是"比较器,Comparator"
		 * 使用这个方法可以解决:
		 * 1.sort方法要求排序元素必须实现Comparable接口,而该sort方法不要求,所以
		 * 没有对元素的侵入性
		 * 2.java提供的类需要排序时由于已经实现了Comparable接口并定义了比较规则,
		 * 但由于有不满足排序需求的情况,也可以通过这种sort方法传入额外比较规则来
		 * 解决.
		 */
		/*Comparator com = new Comparator<String>(){
			@Override
			public int compare(String o1,String o2) {
				return o1.length()-o2.length();
			}
		};
		Collections.sort(list2,com);*/
		//注释代码等价与:
		Collections.sort(list2,new Comparator<String>(){public int compare(String o1,String o2){return o1.length()-o2.length();}});
		System.out.println(list2);
	}
}

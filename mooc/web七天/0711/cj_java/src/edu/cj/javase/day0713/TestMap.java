package edu.cj.javase.day0713;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	/**
	 * 将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。 
	 * 
	 * 此接口取代 Dictionary 类，后者完全是一个抽象类，而不是一个接口。
	 * 
	 * Map 接口提供三种collection 视图，
	 * 允许以键集、值集或键-值映射关系集的形式查看某个映射的内容。
	 * 映射顺序 定义为迭代器在映射的 collection 视图上返回其元素的顺序。
	 * 某些映射实现可明确保证其顺序，如 TreeMap 类；另一些映射实现则不保证顺序，如 HashMap 类。 
	 * 
	 * 基于哈希表的 Map 接口的实现。
	 * 此实现提供所有可选的映射操作，
	 * 并允许使用 null 值和 null 键。
	 * （除了非同步和允许使用 null 之外，HashMap 类与 Hashtable 大致相同。）
	 * 此类不保证映射的顺序，特别是它不保证该顺序恒久不变。 
	 * 
	 * 通常，默认加载因子 (.75) 
	 * 在时间和空间成本上寻求一种折衷。
	 * 加载因子过高虽然减少了空间开销，
	 * 但同时也增加了查询成本（在大多数 HashMap 类的操作中，
	 * 包括 get 和 put 操作，都反映了这一点）。
	 * 在设置初始容量时应该考虑到映射中所需的条目数及其加载因子，
	 * 以便最大限度地减少 rehash 操作次数。
	 * 如果初始容量大于最大条目数除以加载因子，则不会发生 rehash 操作。
	 * 
	 * map接口中添加元素用到的是put(K,V)，获取元素还是用get(键),元素个数还是size()
	 * K表示对应的键 
	 * V表示对应的值
	 * 
	 *  如果没用到泛型那么键和值的类型都为Object
	 *  加了泛型则以约束的类型来使用
	 */
	public static void main(String[] args) {
	 /**
	  * Map<String, Student> map = new HashMap<String, Student>();
	  * map.put("1001", new Student(1001,"tom"));
	  * map.put("1002", new Student(1002,"lily"));
	  * 取数据 根据对应的键key来获取对应的值value
	  * Student t = map.get("1002");
	  * System.out.println(t); 
      */
       //默认的初始容量为16,加载因子为0.75。StringBuffer和StringBuilder初始的长度也为16
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("andy", "刘德华");
		map.put("jacky", "张学友");
		map.put("steven", "周星驰");
		map.put("coco", "李玟");
		map.put("lily", "李丽");
		map.put("null", "周星驰");
		map.put(null, "李玟");
		map.put("steven", null);
		map.put(null, "李玟");
		map.put(null, "null");
		map.put(null, null);
		System.out.println(map.size());
		
		//键的集合 
		System.out.println("键的集合:"+map.keySet());
		
		//值的集合 
		System.out.println("值的集合:"+map.values());
		
		//键-值的集合 
		System.out.println("键-值的集合:"+map);
		
		System.out.println(map.get("steven"));
		
		
		//如何遍历map集合的数据
		for (String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
	}

}
class Student{
	private int stuId;
	private String stuName;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}
	
	
}

package collection.other;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * java.util.Map
 * 查找表
 * Map体现的样子是一个多行两列的表格
 * 以key-value对的形式存储元素.
 * Map要求key不允许重复(equals判断)
 * 常用实现类:
 * java.util.HashMap  即:散列表(散列算法实现)
 *
 */

public class Map_Demo {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		/*
		 * V put(Key k,Value v)
		 * 将给定的key-value对存入Map
		 * 由于Map不允许有重复的key,所以若给定的key在Map中已经存在,
		 * 则是替换value操作,那么返回值就是被替换的value值.若给定的
		 * key在Map中不存在,则返回值为null
		 * 
		 */
		map.put("语文", 90);
		map.put("数学", 91);
		
		Integer num = map.put("英语", 89); 
		System.out.println(num);
		System.out.println(map);
		//相同的key是替换value操作
		num = map.put("数学", 95);
		System.out.println(num);
		System.out.println(map);
		
		/*
		 * V get(Key k)
		 * 根据给定的key获取对应的Value
		 * 若给定的Key不存在则返回值为null
		 */
		
		num = map.get("语文");
		System.out.println(num);
		num = map.get("音乐");
		System.out.println(num);
		
		/*
		 * 删除Map中指定元素
		 * V remove(Key k)
		 * 将给定的key所对应的key-value对从Map中删除,返回值为该key所对应的value
		 * 
		 */
		
		map.put("英语", 70);
		map.put("体育", 89);
		map.put("物理", 93);
		System.out.println(map);
		Integer old = map.remove("数学");
		System.out.println(old);
		System.out.println(map);
		
		/*
		 * boolean containsKey(Object key)
		 * 若Map中包含给定的key则返回true,否则返回false
		 */
		
		/*
		 * Map的遍历
		 * 遍历Map有三种模式:
		 * 1.遍历所有的key
		 * 2.遍历所有的value
		 * 3.遍历每一组key-value对
		 */
		/*
		 * 遍历所有的Key
		 * Set<K> keySet()
		 * 将当前Map中所有的key存入一个Set集合后将其返回,那么遍历该集合就等同与遍历了所有的key
		 * 
		 */
		Set<String> keySet = map.keySet();
		for(String s:keySet){
			System.out.println("Key:"+s);
		}
		
		/*
		 * 遍历每一组键值对
		 * Set<Entry> entrySet()
		 * 将当前Map中每一组键值对(Entry实例)存入一个Set集合后返回
		 * java.util.Map.Entry
		 * 该类的每一个实例用于表示Map中的一组键值对
		 */
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> e:entrySet){
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 * 遍历所有的value
		 * Collection values()
		 * 将当前Map中所有的value存入到一个集合后放回
		 * 
		 */
		
		Collection<Integer> values = map.values();
		for(Integer value: values){
			System.out.println("value:"+value);
		}
	}

}

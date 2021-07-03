package collection.other;
/**
 * 
 * 影响散列表查询性能的一个因素是:产生链表
 * 而链表产生的一个重要因素是:作为key的元素hashcode值一样,而equals
 * 比较不为true.hashcode值一样时,在Map内部数组的位置相同,但是若key
 * 不相同,那么就会在该位置产生一个链表.遍历链表检索数据会降低hashcode
 * 检索性能,所以要避免.
 * 
 * 在HashMap的应用中,Key元素的equals方法与hashcode方法直接影响着
 * 散列表的查询性能.而这两个方法是Object定义的方法,在手册上也明确
 * 说明,当我们需要重写时,两个方法应当遵循:
 *  1.成对重写,即:当重写一个类的equals方法时就应当连同重写hashcode
 *  2.equals与hashcode应当具有一致性,即:
 *    两个对象equals比较为true时,hashcode方法返回的数字应当相同.
 *    反过来也是如此.虽然不是必须的,但尽量保持当两个对象hashcode方
 *    法放回值相等时equals也应当为true,否则会在HashMap中产生链表
 *    影响查询性能.
 *  3.hashcode方法的值应当是稳定的,即:在当前对象参与equals比较的
 *    属性值没有发生改变的前提下,多次调用hashcode方法返回的数字应
 *    当相同.
 *    
 * @author soft01
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}

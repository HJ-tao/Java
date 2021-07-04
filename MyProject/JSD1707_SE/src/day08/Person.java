package day08;
/**
 * 使用该类次测试throw,throws的用法
 * @author Random
 *	
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	/**
	 * throw用于向方法的调用者抛出一个异常,通常两种情况下
	 * 会主动抛出异常:
	 * 1.当前方法在调用时遇到了一个满足语法要求(程序可以正常
	 * 运行),但是不满足该方法设计的业务逻辑需求时,可以当作一
	 * 个异常抛给调用者.
	 * 2.当前方法确实运行中出现了异常,但是该异常不应当在当前
	 * 方法中给解决时,可以抛出给调用者解决.
	 * 
	 * throws的作用是在声明方法的同时声明该方法可能抛出的
	 * 异常以通知调用者在调用该方法时去处理该异常.
	 * 除了RuntimeException的其他类型异常在方法中被抛出
	 * 时,该方法必须用throws声明这类异常的抛出,否则编译不
	 * 通过.
	 * @param age
	 * @throws IllegalAgeException 
	 */
	public void setAge(int age) throws IllegalAgeException {
		if(age<=0||age>100){
			throw new IllegalAgeException("年龄不合法.");
		}
		this.age = age;
	}
	
	
}

package day09;
/**
 * 使用该类测试throw,throws的用法
 * @author adminitartor
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/**
	 * throw用于向方法的调用者抛出一个异常
	 * 通常两种情况下会主动抛出异常:
	 * 1:当前方法在调用时遇到了一个满足语法
	 *   要求(程序可以正常运行),但是不满足该
	 *   方法设计的业务逻辑需求时,可以当作一
	 *   个异常抛出给调用者.
	 * 2:当前方法确实运行中出现了异常,但是该
	 *   异常不应当在当前方法中给解决时,可以
	 *   抛出给调用者解决.  
	 *   
	 *   
	 * throws的作用是在声明方法的同时声明该方法
	 * 可能抛出的异常以通知调用者在调用该方法时
	 * 去处理该异常.
	 * 除了RuntimeException的其他类型异常在方法
	 * 中被抛出时,该方法必须用throws声明这类异常
	 * 的抛出,否则编译不通过.  
	 * @param age
	 */
	public void setAge(int age)throws IllegalAgeException {
		if(age<=0||age>100){
			throw new IllegalAgeException("年龄不合法");
		}
		this.age = age;
	}
	
	
}






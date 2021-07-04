package day08;
/**
 * 测试异常的抛出
 * @author Random
 *	
 */
public class Exception_throw {

	public static void main(String[] args) {
		Person p = new Person();
		/*
		 * 当调用一个含有throws声明异常抛出的方法时,编译器会要求必须有
		 * 处理该异常的手段,处理异常有两种方式:
		 * 1.使用try-catch捕获并处理
		 * 2.在当前方法继续使用throws声明该异常的抛出
		 */
		try {
			p.setAge(200);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
		System.out.println(p.getAge());
	}

}

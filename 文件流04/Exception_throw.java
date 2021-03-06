package day09;
/**
 * 测试异常的抛出
 * @author adminitartor
 *
 */
public class Exception_throw {
	public static void main(String[] args) {
		Person p = new Person();
		/*
		 * 当调用一个含有throws声明异常抛出的
		 * 方法时,编译器会要求必须有处理该异常
		 * 的手段,处理异常有两种方式:
		 * 1:使用try-catch捕获并处理
		 * 2:在当前方法继续使用throws声明该
		 *   异常的抛出
		 */
		try {
			p.setAge(2000);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
	
		System.out.println(p.getAge());
		
		
	}
}



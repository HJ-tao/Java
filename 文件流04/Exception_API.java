package day09;
/**
 * 异常的常用方法
 * @author adminitartor
 *
 */
public class Exception_API {
	public static void main(String[] args) {
		System.out.println("程序开始了.");
		try{
			String str = "abc";
			System.out.println(
				Integer.parseInt(str)
			);
		}catch(NumberFormatException e){
			//输出错误堆栈信息
			e.printStackTrace();
			
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("程序结束了.");
	}
}




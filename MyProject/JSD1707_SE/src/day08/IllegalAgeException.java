package day08;
/**
 * 自定义异常
 * 自定义异常通常用来说明我们项目中某个业务逻辑异常
 * 
 * 年龄不合法异常
 * 当设置年龄时给定的值超出人类年龄范畴时会抛出该异常
 * @author Random
 *	JSD1707_SE day08
 *	@2017年8月26日上午10:12:33 
 *	Class Description:
 */
public class IllegalAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
}

package day08;
/**
 * �쳣�ĳ��÷���
 * @author Random
 *	JSD1707_SE day08
 *	@2017��8��26������10:02:17 
 *	Class Description:
 */
public class Exception_API {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try{
			String str = "abc";
			System.out.println(Integer.parseInt(str));
		}catch(NumberFormatException e){
			//��������ջ��Ϣ
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println("error:"+message);
		}
		System.out.println("���������");
	}

}

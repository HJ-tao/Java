package day09;
/**
 * �쳣�ĳ��÷���
 * @author adminitartor
 *
 */
public class Exception_API {
	public static void main(String[] args) {
		System.out.println("����ʼ��.");
		try{
			String str = "abc";
			System.out.println(
				Integer.parseInt(str)
			);
		}catch(NumberFormatException e){
			//��������ջ��Ϣ
			e.printStackTrace();
			
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("���������.");
	}
}




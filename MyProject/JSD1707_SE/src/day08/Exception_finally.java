package day08;


/**
 * finally��
 * finally��ֻ�ܳ������쳣������Ƶ����
 * ��:try����������һ��catch֮��.
 * finally����Ա�֤����try���еĴ����Ƿ�
 * �׳��쳣�ÿ��еĴ��붼һ����ִ��.
 * ����ͨ���Ὣ���۳����Ƿ����Ҫ���еĴ�
 * �����finally��ȷ��ִ��,�����������е�
 * �ر����Լ������ͷ���Դ�Ȳ���.
 * @author soft01
 *
 */
public class Exception_finally {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try{
			String str = "";
			System.out.println(str.length());
			//return;
		}catch(Exception e){
			System.out.println("������.");
		}finally{
			System.out.println("finally�еĴ���ִ����");
		}
		System.out.println("���������");
	}
}

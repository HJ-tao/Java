package day08;
/**
 * java�쳣�������
 * try{}��,���������ܳ����쳣�Ĵ���Ƭ��������
 * catch���������񲢽��try���д����׳����쳣
 * 
 * try���ǲ��ܵ��������,����ͨ���ᶨ��catch��
 * Ҳ����ֱ�Ӹ�finally��.
 * @author soft01
 *
 */
public class Exception_try_catch {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try{
			String str = null;
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			//try�г��ִ���Ĵ�������Ĵ��벻��ʵ��
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ�룡");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�ַ����±�Խ��.");
			/*
			 * catch���Զ�����,��Բ�ͬ�쳣�в�ͬ�����ֶ�ʱ,Ӧ���ֱ𲶻�
			 * �������ֶ�.
			 * ����Ӧ������һ����ϰ��,�������沶��Exception,�Է������г���һ
			 * ��δ֪�쳣�����³����ж�.
			 * ��������쳣֮����ڼ̳й�ϵʱ,Ӧ���Ȳ����������쳣�󲶻�����
			 * �쳣
			 */
		}catch(Exception e){
			System.out.println("�������ǳ���һ����!");
		}
		
		System.out.println("���������");
	}

}

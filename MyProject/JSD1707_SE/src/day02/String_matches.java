package day02;

import java.util.Scanner;

/**
 * �ַ���֧��������ʽ����ط���֮һ
 * boolean matches(String regex)
 * ʹ�ø�����������ʽƥ�䵱ǰ�ַ����ĸ�ʽ�Ƿ������������ʽҪ��,�����򷵻�true��
 * @author soft01
 *
 */
public class String_matches {

	public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+$";
		System.out.println(regex);
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ַ:");
		String email = sc.nextLine();
		/*
		 * String�ṩ��matches���������������ʽ���㲻�ӱ߽��(^$)Ҳ��
		 * ȫƥ����֤
		 */
		boolean ihh = email.matches(regex);
		if(ihh){
			System.out.println("ƥ��");
		}else{
			System.out.println("��ƥ��");
		}
		sc.close();
	}

}

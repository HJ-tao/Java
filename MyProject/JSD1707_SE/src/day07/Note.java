package day07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ��дһ�����׼��±�����
 * ����������,Ҫ����������һ���ļ���,Ȼ����Ը��ļ�д��Ϣ
 * �û��ڿ���̫�����ÿ���ַ���������д�뵽�ļ���.
 * ���û�����"exit"ʱ�����˳�.
 * @author soft01
 *
 */
public class Note {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������ļ���:");
		String filename = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(filename);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		/*
		 * ������PWʱ��һ������Ϊ��ʱ,��֧�ֵڶ�������Ϊbooleanֵ�Ĺ��췽��,�ù��췽��
		 * �������true,��ǰPW�����Զ���ˢ�¹���.
		 * ��:ʹ��pw.println����д��һ���ַ�������Զ�flush
		 */
		PrintWriter pw = new PrintWriter(osw,true);
		System.out.println("���ڿ���д�����ݣ�");
		
		String content;
		do{
			content = sc.nextLine();
			if("EXIT".equals(content.toUpperCase())){
				break;
			}
			pw.println(content);
		}while(true);
		System.out.println("�˳�����.");
		pw.close();
	}

}

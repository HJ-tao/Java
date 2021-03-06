package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ��дһ�����׼��±�����
 * ����������,Ҫ���û�����һ���ļ���,Ȼ��
 * ��Ը��ļ�д��Ϣ.
 * �û��ڿ���̨�����ÿ���ַ���������д��
 * �����ļ���.
 * ���û�����"exit"ʱ�����˳�.
 * @author adminitartor
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ���:");
		String fileName = scanner.nextLine();
		
		FileOutputStream fos
			= new FileOutputStream(fileName);
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		/*
		 * ������PWʱ��һ������Ϊ��ʱ,��֧�ֵڶ���
		 * ����Ϊbooleanֵ�Ĺ��췽��,�ù��췽��
		 * �������true,��ǰPW�����Զ���ˢ�¹���
		 * ��:ʹ��pw.println����д��һ���ַ�����
		 * ���Զ�flush
		 */
		PrintWriter pw
			= new PrintWriter(osw,true);
		
		System.out.println("����������:");
		String line = null;
		while(true){
			line = scanner.nextLine();
			if("exit".equals(line.toLowerCase())){
				break;
			}
			pw.println(line);
//			pw.flush();
		}
		System.out.println("�ټ�!");
		pw.close();
		
		
	}
}









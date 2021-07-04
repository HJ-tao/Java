package day07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedLine()
 * �����ַ�������,���԰��ж�ȡ�ַ���
 * @author soft01
 *
 */
public class BufferedReader_readLine {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(
				"src"+File.separator+
				"day07"+File.separator+
				"BufferedReader_readLine.java");
		InputStreamReader isr = new InputStreamReader(fis);
		//���ַ�ת��Ϊ�ַ�
		BufferedReader br = new BufferedReader(isr);
		//���ַ����ж�ȡ
		/*
		 * String readLine()
		 * ������ȡ�����ַ�,ֱ����ȡ�����з�Ϊֹ,Ȼ�������ַ���һ���ַ���
		 * ����ʽ����.ע��:���ص�����ַ������ǲ��������Ļ��з���.
		 * ���÷�������ֵΪnull�����ʾ��ȡ���ļ�ĩβ.������BR��ȡ�����豸
		 * ʱ������ֵΪnull��ζ��ͨ�������������ٶ�ȡ���κ�����.
		 */
		String line = null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}

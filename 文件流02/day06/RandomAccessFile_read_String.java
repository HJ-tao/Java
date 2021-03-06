package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ַ���
 * @author adminitartor
 *
 */
public class RandomAccessFile_read_String {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile(
				"raf.txt","r"
			);
		
		byte[] data = new byte[200];
		int len = raf.read(data);
		System.out.println(len);
		/*
		 * byte->String
		 * String�ṩ���췽��:
		 * String(byte[] data)
		 * �������ֽ������������ֽ�
		 * ����ϵͳĬ�ϵ��ַ�����ԭΪ�ַ���
		 * 
		 * String(byte[] data,int start,int len)
		 * 
		 * ����Ĺ��췽�����԰���ָ�����ַ���ת��
		 * String(byte[] data,Strin csn)
		 * String(byte[] data,int start,int len,Strin csn)
		 * 
		 */
		String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		
		raf.close();
	}
}







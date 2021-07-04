package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ַ���
 * @author soft01
 *
 */
public class RandomAccessFile_read_String {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt","r");
		byte[] data = new byte[200];
		int len = raf.read(data);
		System.out.println("ʵ�ʶ�ȡ�ֽ�:"+len);
		/*
		 * byte->String
		 * String�ṩ���췽��:
		 * String(byte[] data)
		 * �������ֽ������������ֽڰ���ϵͳĬ�ϵ��ַ�����ԭΪ�ַ���
		 * 
		 * String(byte[] data,int start,int end)
		 * ����Ĺ��췽�����԰���ָ�����ַ���ת��
		 * String(byte[] data,String csn)
		 * String(byte[] data,int start,int end,String csn)
		 */
		String str = new String(data,0,len,"GBK");
		System.out.println(str);
		
		raf.close();
		
	}

}
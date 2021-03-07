package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * д�ַ���
 * @author soft01
 *
 */
public class RandomAccessFile_write_String {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
		String str = "�����ٿ���һ��,���ϵ���.";
		//String-->byte
		/*
		 * String�ṩ�˽��ַ���ת��Ϊ�ֽڵķ���:
		 * byte[] getBytes()
		 * ����ǰ�ַ�������ϵͳĬ���ַ���ת��Ϊһ���ֽ�
		 * 
		 * byte[] getBytes(String csn)
		 * ����ָ�����ַ������ַ���ת��Ϊһ���ֽ�
		 */
		byte[] data = str.getBytes("GBK");
		
		raf.write(data);
		
		raf.write("���Ǳ��廷·,��ס��˫��.".getBytes());
		System.out.println("д�����!");
		
		raf.close();
	}

}

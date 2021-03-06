package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取字符串
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
		 * String提供构造方法:
		 * String(byte[] data)
		 * 将给定字节数组中所有字节
		 * 按照系统默认的字符集还原为字符串
		 * 
		 * String(byte[] data,int start,int len)
		 * 
		 * 下面的构造方法可以按照指定的字符集转换
		 * String(byte[] data,Strin csn)
		 * String(byte[] data,int start,int len,Strin csn)
		 * 
		 */
		String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		
		raf.close();
	}
}







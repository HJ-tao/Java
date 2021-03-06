package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 写字符串
 * @author adminitartor
 *
 */
public class RandomAccessFile_write_String {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile(
				"raf.txt","rw"
			);
		
		String str = "让我再看你一遍,从南到北.";
		/*
		 * String-->byte
		 * String提供了将字符串转换为字节的方法:
		 * byte[] getBytes()
		 * 将当前字符串按照系统默认字符集转换为
		 * 一组字节
		 * 
		 * byte[] getBytes(String csn)
		 * 按照指定的字符集将字符串转换为
		 * 一组字节
		 */
		byte[] data = str.getBytes("UTF-8");
		
		raf.write(data);
		
		raf.write("像是北五环路,蒙住的双眼.".getBytes("UTF-8"));
		System.out.println("写出完毕!");
		
		raf.close();
	}
}








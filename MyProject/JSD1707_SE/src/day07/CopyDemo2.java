package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * java.io.BufferedInputStream
 * java.io.BufferedOuputStream
 * 缓冲流是一对高价流,使用他们可以提高读写效率
 * @author soft01
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream src = new FileInputStream("fos.txt");
		
		BufferedInputStream bis = new BufferedInputStream(src);
		
		FileOutputStream desc = new FileOutputStream("fis.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(desc);
		
		byte[] car = new byte[1024*10];
		
		int len = -1;
		/*
		 * 缓冲流内部维护一个字节数组,实际上也是通过提高每次实际读写的字节量
		 * 减少读写次数来提高的读写效率.
		 * 例如:
		 * 当调用bis.read()方法读取一个字节时,实际上bis会通过文件流一次性
		 * 读取若干字节并存入内部的字节数组,然后只将第一个字节返回.当后面再次
		 * 调用read方法读取一个字节时,bis则直接将数组中下一个字节返回,直到所
		 * 有字节都已经返回后才会再次读取一组字节回来.
		 */
		while((len=bis.read(car))!=-1){
			bos.write(car,0,len);
		}

		System.out.println("复制完毕!");
		bis.close();
		bos.close();
	}

}

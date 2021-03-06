package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 用来读写文件数据的类
 * RAF是基于指针进行文件数据的读写的,即:
 * 总是在指针当前位置读写字节.
 * 创建RAF有两种常用模式:
 * 1:只读模式
 * 2:读写模式
 * @author adminitartor
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 创建RandomAccessFile时常用的构造方法:
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file,String mode)
		 * 其中第一个参数为要进行读写操作的文件.
		 * 第二个参数为模式:
		 * "r":只读模式
		 * "rw":读写模式
		 */
		RandomAccessFile raf
			= new RandomAccessFile(
				"raf.dat","rw"	
			);
		/*
		 * void write(int d)
		 * 向文件中写入1个字节,写的内容是
		 * 指定int值对应2进制的"低八位"
		 *                            vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 * 00000000 00000000 00000000 11111111
		 * 
		 */
		raf.write(1);
		System.out.println("写出完毕!");
		
		raf.close();
	}
}









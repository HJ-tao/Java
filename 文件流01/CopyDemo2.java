package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 由于磁盘单字节读写速度差,所以
 * 可以通过提高每次读写的数据量,减少读写
 * 次数来提高读写效率.
 * @author adminitartor
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
			= new RandomAccessFile(
				"01.mp4","r"	
			);
		RandomAccessFile desc
			= new RandomAccessFile(
				"01_cp1.mp4","rw"	
			);
		/*
		 * RAF提供了单次读取多字节的方法:
		 * int read(byte[] data)
		 * 一次性尝试读取给定的字节数组总
		 * 长度的字节量,并将读取到的字节存入
		 * 到该数组中,返回值为实际读取到的
		 * 字节量,若返回值为-1,表示本次没有
		 * 读取到任何数据(文件末尾)
		 */
		//10k
		byte[] data = new byte[1024*10];
		int len = -1;
		
		long start = System.currentTimeMillis();
		while((len = src.read(data))!=-1){
			/*
			 * RAF提供了写出一组字节的方法
			 * void write(byte[] data)
			 * 一次性将给定的字节数组中所有
			 * 字节写出.
			 * 
			 * void write(byte[] data,int start,int len)
			 * 将给定的字节数组中从start处开始的
			 * 连续len个字节一次性写出
			 */
			desc.write(data,0,len);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("复制完毕!耗时"+(end-start)+"ms");
		src.close();
		desc.close();
	}
}





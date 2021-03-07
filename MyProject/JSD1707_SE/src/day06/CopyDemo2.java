package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 由于磁盘单字节读写速度差,所以可以通过提高每次读写的数据
 * 量,减少读写次数来提高读写效率.
 * @author soft01
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * RAF提供了单词读取多字节的方法:
		 * int read(byte[] data)
		 * 一次性尝试读取给定的字节数组总长度的字节量,并
		 * 将读取到的字节存入到该数组中,返回值为实际读取
		 * 到的字节量,若返回值为-1,表示本次没有读取到任
		 * 何数据(文件末尾)
		 */
		RandomAccessFile src = new RandomAccessFile("music.mp3","r");
		RandomAccessFile desc = new RandomAccessFile("music_cp.mp3","rw");
		//10kb
		byte[] data = new byte[1024*10];
		int len = -1;
		
		long start = System.currentTimeMillis();
		while((len=src.read(data))!=-1){
			/*
			 * RAF提供了写出一组字节的方法
			 * void write(byte[] data)
			 * 一次性将给定的字节数组中所有字节写出
			 * 
			 * void write(byte[] data,int start,int len)
			 * 将给定的字节数组中从start处开始的连续len个字节一
			 * 次性写出
			 */
			desc.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时"+(end-start));
		src.close();
		desc.close();
	}

}

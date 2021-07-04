package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取字节
 * @author soft01
 *
 */
public class RandomAccessFile_read {

	public static void main(String[] args) throws IOException {
		/*
		 * 读取1个字节,并以int形式返回
		 * 若返回值为-1,则表示读取到了文件末尾.
		 * 11111111  为255
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		int d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		
		raf.close();
		
	}

}

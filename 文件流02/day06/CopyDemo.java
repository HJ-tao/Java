package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 * @author adminitartor
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
			= new RandomAccessFile(
				"01.mp4","r"	
			);
		RandomAccessFile desc
			= new RandomAccessFile(
				"01_cp.mp4","rw"	
			);
		
		int d = -1;//保存每次读取到的字节
		
		long start = System.currentTimeMillis();
		while( (d = src.read()) !=-1 ){
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("复制完毕!耗时:"+(end-start)+"ms");
		
		src.close();
		desc.close();
	}
}








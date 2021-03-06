package day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流写出数据时的缓冲区操作
 * @author soft01
 *
 */
public class BufferOutputStream_flush {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "你还要我怎样,要怎样,你突然来的短信就够我悲伤.";
		byte[] data = str.getBytes();
		
		bos.write(data);
		/*
		 * void flush()
		 * 缓冲流的flush方法的作用是强制将缓冲流内部缓冲区已经缓存的数据一次性写
		 * 出.这样做可以提高写出数据的即时性,但是频繁调用会导致写次数的提高从而减
		 * 低写效率.结合实际业务需求灵活应用.
		 */
		bos.flush();
		System.out.println("写入完毕!");
		bos.close();
	}

}

package day07;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符流
 * BufferedWriter,BufferedReader
 * 缓冲字符流的特点是可以按行读写字符串,内部维护缓冲区,
 * 所以对效率也高.
 * 
 * PrintWriter也是缓冲字符流,并且还支持自动刷新功能,
 * 内部包含BufferedWriter作为其缓冲功能.
 * @author soft01
 *
 */
public class PrintWriter_println {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/*
		 * PW提供了直接针对文件写操作的构造方法
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 * 
		 * 也可以按照指定字符集写出字符串
		 * PrintWriter(File file,String csn)
		 * PrintWriter(String path,String csn)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
		
		pw.println("夜空中最亮的星,");
		pw.println("都能听清,");
		pw.println("那仰望的人,心底的孤独与叹息.");
		
		System.out.println("写出完毕！");
		pw.close();
	}

}

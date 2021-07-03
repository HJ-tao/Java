package day07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedLine()
 * 缓冲字符输入流,可以按行读取字符串
 * @author soft01
 *
 */
public class BufferedReader_readLine {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(
				"src"+File.separator+
				"day07"+File.separator+
				"BufferedReader_readLine.java");
		InputStreamReader isr = new InputStreamReader(fis);
		//将字符转换为字符
		BufferedReader br = new BufferedReader(isr);
		//将字符按行读取
		/*
		 * String readLine()
		 * 连续读取若干字符,直到读取到换行符为止,然后将所有字符以一个字符串
		 * 的形式返回.注意:返回的这个字符串中是不包含最后的换行符的.
		 * 若该方法返回值为null，则表示读取到文件末尾.将来用BR读取其他设备
		 * 时若返回值为null意味着通过该流不可能再读取到任何数据.
		 */
		String line = null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}

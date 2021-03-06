package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 编写一个简易记事本功能
 * 程序启动后,要求用户输入一个文件名,然后
 * 针对该文件写信息.
 * 用户在控制台输入的每行字符串都按行写入
 * 到该文件中.
 * 当用户输入"exit"时程序退出.
 * @author adminitartor
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String fileName = scanner.nextLine();
		
		FileOutputStream fos
			= new FileOutputStream(fileName);
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		/*
		 * 当创建PW时第一个参数为流时,就支持第二个
		 * 参数为boolean值的构造方法,该构造方法
		 * 如果传入true,则当前PW具有自动行刷新功能
		 * 即:使用pw.println方法写出一行字符串后
		 * 会自动flush
		 */
		PrintWriter pw
			= new PrintWriter(osw,true);
		
		System.out.println("请输入内容:");
		String line = null;
		while(true){
			line = scanner.nextLine();
			if("exit".equals(line.toLowerCase())){
				break;
			}
			pw.println(line);
//			pw.flush();
		}
		System.out.println("再见!");
		pw.close();
		
		
	}
}









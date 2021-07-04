package day07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 编写一个简易记事本功能
 * 程序启动后,要求用书输入一个文件名,然后针对该文件写信息
 * 用户在控制太输入的每行字符串都按行写入到文件中.
 * 当用户输入"exit"时程序退出.
 * @author soft01
 *
 */
public class Note {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入文件名:");
		String filename = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(filename);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		/*
		 * 当创建PW时第一个参数为流时,就支持第二个参数为boolean值的构造方法,该构造方法
		 * 如果传入true,则当前PW具有自动行刷新功能.
		 * 即:使用pw.println方法写出一行字符串后会自动flush
		 */
		PrintWriter pw = new PrintWriter(osw,true);
		System.out.println("现在可以写入数据：");
		
		String content;
		do{
			content = sc.nextLine();
			if("EXIT".equals(content.toUpperCase())){
				break;
			}
			pw.println(content);
		}while(true);
		System.out.println("退出操作.");
		pw.close();
	}

}

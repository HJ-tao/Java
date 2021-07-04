package day06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File
 * File类的每一个实例用于表示操作系统中文件系统里的
 * 一个文件或目录
 * 使用File可以:
 * 1.访问文件或目录的属性信息
 * 2.操作文件或目录(创建,删除)
 * 3.访问一个目录中的子项
 * 但是不能访问文件数据.
 * @author soft01
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/*
		 * 创建File时需要指定该文件或目录的路径.
		 * 路径通常使用相对路径(跨平台)
		 * ".":当前目录,当前目录有运行程序的环境决定,在
		 *     eclipse中当前目录的定义是:当前类所在项
		 *     目的根目录(这里是JSD1705_SE)
		 * 目录的层级分隔符:"/","\",由于不同的操作系统
		 * 不一样,java在File中提供了常量separator来
		 * 屏蔽差异.
		 */
		File file = new File("."+File.separator+"demo.txt");//.表示当前工作根目录
		//获取文件名
		String name = file.getName();
		System.out.println("文件名:"+name);
		//返回文件的大小(字节量)
		long length = file.length();
		System.out.println("大小:"+length+"字节");
		
		boolean canRead = file.canRead();
		boolean canWrite = file.canWrite();
		System.out.println("可读:"+canRead);
		System.out.println("可写:"+canWrite);
		
		boolean isHidden = file.isHidden();
		System.out.println("是否隐藏:"+isHidden);
		/*
		 * 最后修改日期
		 */
		long time = file.lastModified();
		System.out.println(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日,H:m:s");
		String str = sdf.format(time);
		System.out.println(str);
	}
}

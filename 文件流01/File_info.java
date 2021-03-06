package day06;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * java.io.File
 * File类的每一个实例是用于表示操作系统中
 * 文件系统里的一个文件或目录
 * 使用File可以:
 * 1:访问文件或目录的属性信息
 * 2:操作文件或目录(创建,删除)
 * 3:访问一个目录中的子项
 * 但是不能访问文件数据.
 * @author adminitartor
 *
 */
public class File_info {
	public static void main(String[] args) {
		/*
		 * 创建File时需要指定该文件或目录的
		 * 路径.
		 * 路径通常使用相对路径(跨平台)
		 * ".":当前目录,当前目录由运行程序
		 *     的环境决定,在eclipse中当前
		 *     目录的定义是:当前类所在项目
		 *     的根目录(这里是JSD1705_SE)
		 * 目录的层级分隔符:"\","/",由于不同
		 * 的操作系统不一样,java在File中提供
		 * 了常量separator来屏蔽差异.
		 * 
		 */
		File file = new File(
			"."+File.separator+"demo.txt"
		);
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
		 * 2017年6月28日,9:29:42
		 */
		long time = file.lastModified();
		System.out.println(time);
		SimpleDateFormat sdf
			= new SimpleDateFormat(
				"yyyy年M月d日,H:m:s"	
			);
		String str = sdf.format(time);
		System.out.println(str);
	}
}











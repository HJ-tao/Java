package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * File提供了一个重载的listFiles方法,可以额外指定一个文件
 * 过滤器(FileFilter)然后将File表示的目录中满足该过滤器要
 * 求的子项返回
 * @author soft01
 *
 */
public class File_listFiles2 {

	public static void main(String[] args) {
		/*
		 * 获取当前目录中所有名字以点开头的子项
		 */
		File dir = new File(".");
		File[] subs = dir.listFiles(new FileFilter(){
			public boolean accept(File file){
				String name = file.getName();
				System.out.println("正在过滤:"+name);
				return name.startsWith(".");
			}
		});
		for(File sub:subs){
			System.out.println(sub.getName());
		}
	}

}

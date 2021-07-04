package day06;

import java.io.File;

/**
 * 获取一个目录中的子项目
 * @author soft01
 *
 */
public class File_listFiles {

	public static void main(String[] args) {
		/*
		 * 获取当前目录中的所有子项
		 */
		File dir = new File(".");
		/*
		 * boolean isFile()
		 * boolean isDirectory()
		 * 判断当前File表示的是文件还是目录
		 */
		if(dir.exists()&&dir.isDirectory()){
			File[] subs = dir.listFiles();
			for(File sub:subs){
				if(sub.isFile()){
					System.out.print("文件:");
				}
				if(sub.isDirectory()){
					System.out.print("目录:");
				}
				System.out.println(sub.getName());
			}
		}
	}

}

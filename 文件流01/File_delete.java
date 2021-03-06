package day06;

import java.io.File;

/**
 * 删除一个文件
 * @author adminitartor
 *
 */
public class File_delete {
	public static void main(String[] args) {
		/*
		 * 将当前目录下的test.txt文件删除
		 * "./"不写默认也是当前目录
		 */
		File file = new File("test.txt");
		
		if(file.exists()){
			file.delete();
			System.out.println("文件已删除!");
		}else{
			System.out.println("文件不存在!");
		}
	}
}







package day06;

import java.io.File;

/**
 * 删除一个文件
 * @author soft01
 *
 */
public class File_delete {

	public static void main(String[] args) {
		/*
		 * 将当前目录下的test.txt文件删除
		 */
		File file = new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("文件已经删除！");
		}else{
			System.out.println("文件不存在！");
		}
	}

}

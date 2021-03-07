package day06;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建文件
 * @author soft01
 *
 */
public class File_createNewFile {

	public static void main(String[] args) throws IOException {
		/*
		 * 在当前目录创建:test.txt
		 */
		File file = new File("."+File.separator+"test.txt");
		/*
		 * boolean exists()
		 * 判断当前File表示的文件或目录是否已经存在
		 */
		if(!file.exists()){
			file.createNewFile();
			System.out.println("创建完毕！");
		}else{
			System.out.println("该文件已经存在！");
		}
	}

}

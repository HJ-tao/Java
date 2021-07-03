package day06;

import java.io.File;

/**
 * 使用File创建一个目录
 * @author soft01
 *
 */
public class File_mkdir {

	public static void main(String[] args) {
		/*
		 * 在当前目录下创建目录:demo
		 */
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("创建目录完毕!");
		}else{
			System.out.println("目录已经存在!");
		}
	}

}

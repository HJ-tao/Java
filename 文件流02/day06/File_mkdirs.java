package day06;

import java.io.File;

/**
 * 创建一个多级目录
 * @author adminitartor
 *
 */
public class File_mkdirs {
	public static void main(String[] args) {
		/*
		 * 在当前目录下创建:a/b/c/d/e/f
		 */
		File dir = new File(
			"a"+File.separator+
			"b"+File.separator+
			"c"+File.separator+
			"d"+File.separator+
			"e"+File.separator+
			"f"
		);
		if(!dir.exists()){
			/*
			 * mkdir方法要求创建的目录所在的
			 * 父目录必须存在.
			 * mkdirs则会将所有不存在的父目录
			 * 一并创建出来
			 */
			dir.mkdirs();
			System.out.println("创建完毕!");
		}else{
			System.out.println("该目录已存在!");
		}
		
		
	}
}







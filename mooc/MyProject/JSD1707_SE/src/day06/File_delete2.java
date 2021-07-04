package day06;

import java.io.File;

/**
 * 删除目录
 * @author soft01
 *
 */
public class File_delete2 {

	public static void main(String[] args) {
		/*
		 * 将当前目录下的demo目录删除
		 */
		File dir = new File("a");
		if(dir.exists()){
			//删除目录要求其必须是空目录！
			dir.delete();
			System.out.println("目录已删除");
		}else{
			System.out.println("该目录不存在.");
		}
	}

}

package day06;

import java.io.File;

/**
 * 1:编写代码计算:
 *   1块钱可以买1瓶汽水,2个空瓶可以换1瓶汽水
 *   3个瓶盖可以换一瓶汽水,请问:20块钱可以买
 *   多少瓶汽水?
 *   
 * 2:编写一段代码
 *   计算1+2+3+4+...100
 *   并输出结果.
 *   在这段代码中不得出现while,for关键字
 *     
 * 
 * 编写程序完成删除指定的文件或目录
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);
	}
	/**
	 * 将给定的File所表示的文件或目录删除
	 * @param file
	 */
	public static void delete(File file){
		if(file.isDirectory()){
			//现将该目录中所有子项删除
			File[] subs = file.listFiles();
			for(File sub : subs){
				//递归调用
				delete(sub);
			}
		}
		file.delete();	
	}
}






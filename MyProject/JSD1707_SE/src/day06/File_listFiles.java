package day06;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼�е�����Ŀ
 * @author soft01
 *
 */
public class File_listFiles {

	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼�е���������
		 */
		File dir = new File(".");
		/*
		 * boolean isFile()
		 * boolean isDirectory()
		 * �жϵ�ǰFile��ʾ�����ļ�����Ŀ¼
		 */
		if(dir.exists()&&dir.isDirectory()){
			File[] subs = dir.listFiles();
			for(File sub:subs){
				if(sub.isFile()){
					System.out.print("�ļ�:");
				}
				if(sub.isDirectory()){
					System.out.print("Ŀ¼:");
				}
				System.out.println(sub.getName());
			}
		}
	}

}

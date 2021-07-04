package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * File�ṩ��һ�����ص�listFiles����,���Զ���ָ��һ���ļ�
 * ������(FileFilter)Ȼ��File��ʾ��Ŀ¼������ù�����Ҫ
 * ��������
 * @author soft01
 *
 */
public class File_listFiles2 {

	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼�����������Ե㿪ͷ������
		 */
		File dir = new File(".");
		File[] subs = dir.listFiles(new FileFilter(){
			public boolean accept(File file){
				String name = file.getName();
				System.out.println("���ڹ���:"+name);
				return name.startsWith(".");
			}
		});
		for(File sub:subs){
			System.out.println(sub.getName());
		}
	}

}

package day06;

import java.io.File;

/**
 * ɾ��һ���ļ�
 * @author adminitartor
 *
 */
public class File_delete {
	public static void main(String[] args) {
		/*
		 * ����ǰĿ¼�µ�test.txt�ļ�ɾ��
		 * "./"��дĬ��Ҳ�ǵ�ǰĿ¼
		 */
		File file = new File("test.txt");
		
		if(file.exists()){
			file.delete();
			System.out.println("�ļ���ɾ��!");
		}else{
			System.out.println("�ļ�������!");
		}
	}
}







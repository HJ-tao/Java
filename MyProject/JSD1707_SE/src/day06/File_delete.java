package day06;

import java.io.File;

/**
 * ɾ��һ���ļ�
 * @author soft01
 *
 */
public class File_delete {

	public static void main(String[] args) {
		/*
		 * ����ǰĿ¼�µ�test.txt�ļ�ɾ��
		 */
		File file = new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("�ļ��Ѿ�ɾ����");
		}else{
			System.out.println("�ļ������ڣ�");
		}
	}

}

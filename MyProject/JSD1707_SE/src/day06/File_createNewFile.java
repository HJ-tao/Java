package day06;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File�����ļ�
 * @author soft01
 *
 */
public class File_createNewFile {

	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰĿ¼����:test.txt
		 */
		File file = new File("."+File.separator+"test.txt");
		/*
		 * boolean exists()
		 * �жϵ�ǰFile��ʾ���ļ���Ŀ¼�Ƿ��Ѿ�����
		 */
		if(!file.exists()){
			file.createNewFile();
			System.out.println("������ϣ�");
		}else{
			System.out.println("���ļ��Ѿ����ڣ�");
		}
	}

}

package day06;

import java.io.File;

/**
 * ɾ��һ��Ŀ¼
 * @author adminitartor
 *
 */
public class File_delete2 {
	public static void main(String[] args) {
		/*
		 *  ����ǰĿ¼�µ�demoĿ¼ɾ��
		 */
		File dir = new File("a");
		if(dir.exists()){
			//ɾ��Ŀ¼Ҫ��������ǿ�Ŀ¼!
			dir.delete();
			System.out.println("Ŀ¼��ɾ��");
		}else{
			System.out.println("��Ŀ¼������");
		}
	}
}







package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ļ�������,���ڴ��ļ��н����ݶ�ȡ��
 * ������
 * @author adminitartor
 *
 */
public class FileInputStream_read {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("fos.txt");
		
		byte[] data = new byte[200];
		
		int len = fis.read(data);
		
		String str = new String(data,0,len);
		System.out.println(str);
		
		fis.close();
	}
}












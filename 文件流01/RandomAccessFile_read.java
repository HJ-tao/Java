package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ֽ�
 * @author adminitartor
 *
 */
public class RandomAccessFile_read {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile(
				"raf.dat","r"	
			);
		/*
		 * ��ȡ1���ֽ�,����int��ʽ����.
		 * ������ֵΪ-1,���ʾ��ȡ�����ļ�
		 * ĩβ.
		 * 00000000 00000000 00000000 11111111
		 */
		int d = raf.read();
		System.out.println(d);
		
		raf.close();
	}
}







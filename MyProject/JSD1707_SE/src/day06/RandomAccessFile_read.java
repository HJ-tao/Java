package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ֽ�
 * @author soft01
 *
 */
public class RandomAccessFile_read {

	public static void main(String[] args) throws IOException {
		/*
		 * ��ȡ1���ֽ�,����int��ʽ����
		 * ������ֵΪ-1,���ʾ��ȡ�����ļ�ĩβ.
		 * 11111111  Ϊ255
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		int d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		
		raf.close();
		
	}

}

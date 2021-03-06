package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * ������д�ļ����ݵ���
 * RAF�ǻ���ָ������ļ����ݵĶ�д��,��:
 * ������ָ�뵱ǰλ�ö�д�ֽ�.
 * ����RAF�����ֳ���ģʽ:
 * 1:ֻ��ģʽ
 * 2:��дģʽ
 * @author adminitartor
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ����RandomAccessFileʱ���õĹ��췽��:
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file,String mode)
		 * ���е�һ������ΪҪ���ж�д�������ļ�.
		 * �ڶ�������Ϊģʽ:
		 * "r":ֻ��ģʽ
		 * "rw":��дģʽ
		 */
		RandomAccessFile raf
			= new RandomAccessFile(
				"raf.dat","rw"	
			);
		/*
		 * void write(int d)
		 * ���ļ���д��1���ֽ�,д��������
		 * ָ��intֵ��Ӧ2���Ƶ�"�Ͱ�λ"
		 *                            vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 * 00000000 00000000 00000000 11111111
		 * 
		 */
		raf.write(1);
		System.out.println("д�����!");
		
		raf.close();
	}
}









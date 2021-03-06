package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ڴ��̵��ֽڶ�д�ٶȲ�,����
 * ����ͨ�����ÿ�ζ�д��������,���ٶ�д
 * ��������߶�дЧ��.
 * @author adminitartor
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
			= new RandomAccessFile(
				"01.mp4","r"	
			);
		RandomAccessFile desc
			= new RandomAccessFile(
				"01_cp1.mp4","rw"	
			);
		/*
		 * RAF�ṩ�˵��ζ�ȡ���ֽڵķ���:
		 * int read(byte[] data)
		 * һ���Գ��Զ�ȡ�������ֽ�������
		 * ���ȵ��ֽ���,������ȡ�����ֽڴ���
		 * ����������,����ֵΪʵ�ʶ�ȡ����
		 * �ֽ���,������ֵΪ-1,��ʾ����û��
		 * ��ȡ���κ�����(�ļ�ĩβ)
		 */
		//10k
		byte[] data = new byte[1024*10];
		int len = -1;
		
		long start = System.currentTimeMillis();
		while((len = src.read(data))!=-1){
			/*
			 * RAF�ṩ��д��һ���ֽڵķ���
			 * void write(byte[] data)
			 * һ���Խ��������ֽ�����������
			 * �ֽ�д��.
			 * 
			 * void write(byte[] data,int start,int len)
			 * ���������ֽ������д�start����ʼ��
			 * ����len���ֽ�һ����д��
			 */
			desc.write(data,0,len);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("�������!��ʱ"+(end-start)+"ms");
		src.close();
		desc.close();
	}
}





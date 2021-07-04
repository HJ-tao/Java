package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ڴ��̵��ֽڶ�д�ٶȲ�,���Կ���ͨ�����ÿ�ζ�д������
 * ��,���ٶ�д��������߶�дЧ��.
 * @author soft01
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * RAF�ṩ�˵��ʶ�ȡ���ֽڵķ���:
		 * int read(byte[] data)
		 * һ���Գ��Զ�ȡ�������ֽ������ܳ��ȵ��ֽ���,��
		 * ����ȡ�����ֽڴ��뵽��������,����ֵΪʵ�ʶ�ȡ
		 * �����ֽ���,������ֵΪ-1,��ʾ����û�ж�ȡ����
		 * ������(�ļ�ĩβ)
		 */
		RandomAccessFile src = new RandomAccessFile("music.mp3","r");
		RandomAccessFile desc = new RandomAccessFile("music_cp.mp3","rw");
		//10kb
		byte[] data = new byte[1024*10];
		int len = -1;
		
		long start = System.currentTimeMillis();
		while((len=src.read(data))!=-1){
			/*
			 * RAF�ṩ��д��һ���ֽڵķ���
			 * void write(byte[] data)
			 * һ���Խ��������ֽ������������ֽ�д��
			 * 
			 * void write(byte[] data,int start,int len)
			 * ���������ֽ������д�start����ʼ������len���ֽ�һ
			 * ����д��
			 */
			desc.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ"+(end-start));
		src.close();
		desc.close();
	}

}

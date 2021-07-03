package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * java.io.BufferedInputStream
 * java.io.BufferedOuputStream
 * ��������һ�Ը߼���,ʹ�����ǿ�����߶�дЧ��
 * @author soft01
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream src = new FileInputStream("fos.txt");
		
		BufferedInputStream bis = new BufferedInputStream(src);
		
		FileOutputStream desc = new FileOutputStream("fis.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(desc);
		
		byte[] car = new byte[1024*10];
		
		int len = -1;
		/*
		 * �������ڲ�ά��һ���ֽ�����,ʵ����Ҳ��ͨ�����ÿ��ʵ�ʶ�д���ֽ���
		 * ���ٶ�д��������ߵĶ�дЧ��.
		 * ����:
		 * ������bis.read()������ȡһ���ֽ�ʱ,ʵ����bis��ͨ���ļ���һ����
		 * ��ȡ�����ֽڲ������ڲ����ֽ�����,Ȼ��ֻ����һ���ֽڷ���.�������ٴ�
		 * ����read������ȡһ���ֽ�ʱ,bis��ֱ�ӽ���������һ���ֽڷ���,ֱ����
		 * ���ֽڶ��Ѿ����غ�Ż��ٴζ�ȡһ���ֽڻ���.
		 */
		while((len=bis.read(car))!=-1){
			bos.write(car,0,len);
		}

		System.out.println("�������!");
		bis.close();
		bos.close();
	}

}

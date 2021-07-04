package day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���������д������ʱ�Ļ���������
 * @author soft01
 *
 */
public class BufferOutputStream_flush {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "�㻹Ҫ������,Ҫ����,��ͻȻ���Ķ��ž͹��ұ���.";
		byte[] data = str.getBytes();
		
		bos.write(data);
		/*
		 * void flush()
		 * ��������flush������������ǿ�ƽ��������ڲ��������Ѿ����������һ����д
		 * ��.�������������д�����ݵļ�ʱ��,����Ƶ�����ûᵼ��д��������ߴӶ���
		 * ��дЧ��.���ʵ��ҵ���������Ӧ��.
		 */
		bos.flush();
		System.out.println("д�����!");
		bos.close();
	}

}

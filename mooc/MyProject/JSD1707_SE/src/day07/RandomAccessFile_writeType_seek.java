package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile�ṩ�˱�ݵĶ�д�����������ݵ�
 * ����.����RAF�ǻ���ָ����ж�д��,����RAFҲ�ṩ��
 * ����ָ��ķ���.
 * @author soft01
 *
 */
public class RandomAccessFile_writeType_seek {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		/*
		 * long getFilePointer()
		 * ����RAF��ǰָ��λ��
		 */
		long pos = raf.getFilePointer();
		
		/*
		 * ���ļ���д��һ��int���ֵ
		 * 
		 * imax>>>
		 */
		
		System.out.println("pos:"+pos);
		int imax = Integer.MAX_VALUE;
		raf.write(imax>>>24);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(imax>>>16);
		raf.write(imax>>>8);
		raf.write(imax);
		/*
		 * ����д4���ֽڽ�������intֵд��
		 */
		raf.writeInt(imax);
		System.out.println("pos:"+pos);
		/*raf.writeFloat(23.23F);
		raf.writeLong(345L);*/
		
//		/*
//		 * ָ��ָ���ļ�ĩβ
//		 * end of file
//		 */
//		int i = raf.readInt();
//		System.out.println(i);
		
		System.out.println("д����ϣ�");
		/*
		 * void seek(long pos)
		 * ��ָ���ƶ���ָ��λ��
		 */
		raf.seek(0);
		/*
		 * RAF�ṩ����Ӧ��ȡ�����������ݵķ���
		 * int readInt()
		 * ������ȡ4���ֽڲ����ظ�intֵ,����ȡ�����з���
		 * ��ȡ�����ļ�ĩβ���׳�EOFException(�ļ�ĩβ
		 * �쳣)����-1��ʾ�ļ�ĩβ��ԭ��������������ʵ��
		 * ȡ��4���ֽڵ�intֵ,��ô���п������ȡ��һ��-1,
		 * ���Բ�������-1��ʾ�ļ�ĩβ.
		 */
		int i = raf.readInt();
		System.out.println(i);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.seek(8);
		long l = raf.readLong();
		System.out.println(l);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.close();
	}

}

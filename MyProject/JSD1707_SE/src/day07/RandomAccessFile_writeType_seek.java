package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile提供了便捷的读写基本类型数据的
 * 方法.由于RAF是基于指针进行读写的,所以RAF也提供了
 * 操作指针的方法.
 * @author soft01
 *
 */
public class RandomAccessFile_writeType_seek {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		/*
		 * long getFilePointer()
		 * 返回RAF当前指针位置
		 */
		long pos = raf.getFilePointer();
		
		/*
		 * 向文件中写入一个int最大值
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
		 * 连续写4个字节将给定的int值写出
		 */
		raf.writeInt(imax);
		System.out.println("pos:"+pos);
		/*raf.writeFloat(23.23F);
		raf.writeLong(345L);*/
		
//		/*
//		 * 指针指在文件末尾
//		 * end of file
//		 */
//		int i = raf.readInt();
//		System.out.println(i);
		
		System.out.println("写出完毕！");
		/*
		 * void seek(long pos)
		 * 将指针移动到指定位置
		 */
		raf.seek(0);
		/*
		 * RAF提供了相应读取基本类型数据的方法
		 * int readInt()
		 * 连续读取4个字节并返回该int值,若读取过程中发现
		 * 读取到了文件末尾会抛出EOFException(文件末尾
		 * 异常)不以-1表示文件末尾的原因在于这里是真实读
		 * 取了4个字节的int值,那么就有可能真读取到一个-1,
		 * 所以不能再用-1表示文件末尾.
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

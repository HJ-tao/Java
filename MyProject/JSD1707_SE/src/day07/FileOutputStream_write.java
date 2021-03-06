package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java标准的IO操作
 * IO操作的目的是允许程序与外界数据交互.
 * 既可以从外界获取数据,也可以将数据发送
 * 到外界.
 * java中的IO操作是流失操作,根据方向分为:
 * 输入流:用于从外界输入数据到程序(读操作)
 * 输出流:用于将数据发送至外界(写操作)
 * 
 * java将流分为两类:
 * 字节流,处理流
 * 字节流又称为低级流.是真实在程序与数据源
 * 之间的"管道",负责在两端搬运数据.读写一定
 * 基于节点流.
 * 
 * 处理流:处理流不能独立存在(没意义),它的作
 * 用是基于其处理的流工作,简化读写操作.
 * 
 * java提供了两个父类,规定了所有字节输入流与
 * 字节输出流的功能定义.
 * 
 * java.io.InputStream:所有字节输入流都
 * 继承自该流.其规定了使用输入流读取字节的相
 * 关方法.
 * 
 * java.io.OutputStream:所有字节输出流都
 * 继承自该流,规定了所有输出流写出字节的相关
 * 方法.
 * 
 * 文件流
 * java.io.FileOutputStream
 * java.io.FileInputStream
 * 文件流是一对低级流,作用是读写文件中的数据.
 * @author soft01
 *
 */
public class FileOutputStream_write {
	public static void main(String[] args) throws IOException {
		/*
		 * 向fos.txt文件中写出字符串
		 * FileOutputStream提供了相应的构造方法:
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * 上面的两种构造方法创建的文件输出流是覆盖写模式,
		 * 即：若文件已经存在,会先将该文件中所有数据都删除,
		 * 然后将本次通过该流写出的数据作为该文件中的数据.
		 * 
		 * FileOutputStream(String path,boolean append)
		 * FileOutputStream(File file,boolean append)
		 * 这两种构造方法要求在额外传入一个boolean值参数,若该值为true,
		 * 则文件输出流为追加写操作.即:若文件存在,会将本次通过该流写出的
		 * 数据追加到文件末尾.
		 * 
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		fos.write("简单点,说话的方式简单点.".getBytes());
		fos.write("递进的情绪请省略,你又不是个演员,别设计那些情节".getBytes());
		
		System.out.println("写出完毕!");
		fos.close();
	}
}

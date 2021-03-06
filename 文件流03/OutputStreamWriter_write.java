package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * Reader,Writer
 * Reader是所有字符输入流的父类,Writer是所有
 * 字符输出流的父类
 * 
 * 字符流是以字符为最小单位读写数据的,然是实际
 * 本质底层还是读写字节,只是字符与字节的转换
 * 工作有字符流来完成了.
 * 
 * 由于字符流被设计用来读写字符数据,所以字符流
 * 不通用于读写任何种类的数据,只用来读写文本
 * 数据.
 * 
 * 
 * 转换流,转换流是字符流的一套实现类
 * OutputStreamWriter,InputStreamReader
 * 特点:可以按照指定的字符集将字符与字节之间
 * 转换然后读写
 * 
 * 转换流之所以称为转换流是因为在实际的开发
 * 中,在进行流连接操作时,其他的字符高级流都
 * 只能处理其他字符流,然后低级流大部分都是
 * 字节流,这就导致了字符流不能连接到字节流
 * 上,但是转换流是可以处理字节流的,而他们自身
 * 又是字符流,所以在流连接中一般起到衔接其他
 * 字符高级流与字节流的作用.
 * 
 * @author adminitartor
 *
 */
public class OutputStreamWriter_write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		/*
		 * OSW常用构造方法:
		 * OutputStreamWriter(OutputStream out)
		 * 
		 * OutputStreamWriter(
		 * 	OutputStream out,
		 * 	String charSetName
		 * )
		 * 当传入第二个参数时,可以按照指定的字符
		 * 集将字符串转换为字节后写出.
		 */
		OutputStreamWriter osw
			= new OutputStreamWriter(
				fos,"UTF-8"
			);
		
		osw.write("董小姐,你从没忘记你的微笑.");
		osw.write("就算你和我一样,渴望着衰老.");
		
		System.out.println("写出完毕!");
		osw.close();
		
	}
}











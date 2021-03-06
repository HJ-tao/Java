package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 对象流
 * 对象流是一对高级流,作用是方便我们读写java
 * 中的任意对象.
 * 
 * 对象输出流
 * java.io.ObjectOutputStream
 * 对象输出流可以将给定的对象按照结构转换
 * 为一组字节.然后在通过其处理的流将这组
 * 字节写出.
 * @author adminitartor
 *
 */
public class ObjectOutputStream_writeObject {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("苍老师");
		p.setAge(18);
		p.setGender("女");
		
		List<String> otherInfo
			= new ArrayList<String>();
		otherInfo.add("是一名演员");
		otherInfo.add("爱好写毛笔字");
		otherInfo.add("促进中日文化交流");
		otherInfo.add("是广大男性同胞的启蒙老师");
		p.setOtherInfo(otherInfo);
		
		FileOutputStream fos
			= new FileOutputStream("person.obj");
		
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		/*
		 * void writeObject(Object o)
		 * 对象输出流的该方法是将给定对象
		 * 转换为一组字节后写出.
		 * 若希望被OOS写出,就要求该对象所属类
		 * 必须实现可序列化接口.
		 * 
		 * 下面的代码将p对象写出时,经历了
		 * 两个步骤:
		 * 1:通过OOS将给定对象转换为一组字节
		 *   这个过程称为:对象序列化
		 * 2:在将这组字节通过FOS写入到硬盘
		 *   中的这个过程称为:数据持久化  
		 */
		oos.writeObject(p);
		System.out.println("写出完毕!");
		
		oos.close();
	}
}






	

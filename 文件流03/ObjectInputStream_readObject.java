package day08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流
 * 可以将一组字节读取后还原为其表示的对象
 * 前提是这组字节应当是对象输出流将一个对象
 * 转换的字节.否则会抛出异常.
 * @author adminitartor
 *
 */
public class ObjectInputStream_readObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis
			= new FileInputStream("person.obj");
		
		ObjectInputStream ois
			= new ObjectInputStream(fis);
	
		Person p = (Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}
}









	
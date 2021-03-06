package day12;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用XPath检索XML文档数据
 * 需要注意,在DOM4J中如果需要使用这个功能
 * 需要引入一个额外的jar包:jaxen-xx-xx.jar
 * @author adminitartor
 *
 */
public class XPathDemo {
	public static void main(String[] args) {
		try {
			
			SAXReader reader = new SAXReader();
			Document doc = reader.read(
				new File("myemp.xml")
			);
			/*
			 * Document提供了方法:
			 * List selectNodes(String path)
			 * 根据给定的XPATH检索数据并返回
			 * 返回的集合中是Element还是Attribute
			 * 取决于XPATH检索内容.
			 */
			String xpath = "/list/emp[salary>4000 and gender='男']/name";
			List<Element> list 
				= doc.selectNodes(xpath);
			for(Element e : list){
				System.out.println(e.getText());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}









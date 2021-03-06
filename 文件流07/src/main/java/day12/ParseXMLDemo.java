package day12;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用DOM解析XML文档
 * @author adminitartor
 *
 */
public class ParseXMLDemo {
	public static void main(String[] args) {
		/*
		 * 使用dom4j解析xml文档的大致流程
		 * 1:创建SAXReader
		 * 2:使用SAXReader读取XML文档并生成
		 *   Document对象.
		 *   这一步就是DOM解析XML耗时耗资源
		 *   的地方,因为要先将XML文档所有内容
		 *   读取完毕以生成Document,所以耗时
		 *   并且由于Document对象是存入内存
		 *   的所以耗资源.这都取决于XML文档的
		 *   大小.
		 * 3:通过Document对象获取根元素
		 * 4:按照xml文档结构从根元素开始逐级
		 *   获取子元素,以达到遍历XML文档的
		 *   目的.
		 * 
		 */
		try {
			//1
			SAXReader reader = new SAXReader();
			
			//2
			Document document = reader.read(new File("emplist.xml"));		
//			reader.read(new FileInputStream("emplist.xml"));
			
			/*
			 * 3
			 * Document提供了获取根元素的方法:
			 * Element getRootElement()
			 * 
			 * Element的每一个实例用于表示XML文档
			 * 中的一个元素(一对标签)
			 */
			Element root = document.getRootElement();
			/*
			 * Element提供了获取元素内容的相关方法:
			 * 
			 * Element element(String name)
			 * 获取当前元素下指定名字的子元素
			 * 
			 * List elements()
			 * 获取当前元素下的所有子元素
			 * 
			 * List elements(String name)
			 * 获取当前元素下所有同名子元素
			 * 
			 * String getName()
			 * 获取当前元素的名字
			 * 
			 * String getText()
			 * 获取当前元素中间的文本
			 * 
			 * Attribute attribute(String name)
			 * 获取当前元素中指定名字的属性
			 * 
			 */
			//用于保存所有解析出来的员工信息
			List<Emp> empList = new ArrayList<Emp>();
			
			//获取根元素<list>中的所有子元素<emp>
			List<Element> list = root.elements();
			
			for(Element empEle : list){
				//获取name
				Element nameEle = empEle.element("name");
				String name = nameEle.getText();
				
				//获取age
				int age = Integer.parseInt(
					empEle.elementText("age")
				);
		
				//获取gender
				String gender = empEle.elementText("gender");
			
				//获取salary
				int salary = Integer.parseInt(
					empEle.elementText("salary")	
				);
				//获取id属性
				Attribute attr = empEle.attribute("id");
				int id = Integer.parseInt(
					attr.getValue()
				);
				
				Emp emp = new Emp(id, name, age, gender, salary);
				empList.add(emp);
			}
			
			System.out.println("解析完毕!");
			for(Emp emp : empList){
				System.out.println(emp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




package day12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * 使用DOM生成XML文档
 * @author adminitartor
 *
 */
public class WriteXMLDemo {
	public static void main(String[] args) {
		
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1,"张三",22,"男",3000));
		empList.add(new Emp(2,"李四",23,"女",4000));
		empList.add(new Emp(3,"王五",24,"男",5000));
		empList.add(new Emp(4,"赵六",25,"女",6000));
		empList.add(new Emp(5,"钱七",26,"男",7000));
		
		/*
		 * 生成XML文档的大致步骤:
		 * 1:创建Document对象
		 * 2:向Document中添加根元素
		 * 3:向根元素中按照XML文档需要的结构
		 *   逐级添加子元素.
		 * 4:创建XmlWriter
		 * 5:使用XmlWriter将Document写出  
		 */
		XMLWriter writer = null;
		try {
			//1
			Document document
				= DocumentHelper.createDocument();
			
			/*
			 * 2  Document提供了方法:
			 * Element addElement(String name)
			 * 向当前文档中添加给定名字的根元素
			 * 并将其返回,以便针对这个根元素继续
			 * 操作.
			 * 需要注意,该方法只能调用一次,因为
			 * 一个文档中只能有一个根元素
			 */
			Element root 
				= document.addElement("list");
			
			/*
			 * 将集合中的每个员工信息以一个<emp>
			 * 标签形式存入<list>中
			 */
			for(Emp emp:empList){
				/*
				 * 添加<emp>标签
				 * 
				 * Element提供了操作元素的相关方法:
				 * 
				 * Element addElement(String name)
				 * 向当前元素中添加给定名字的子元素
				 * 并将其返回.
				 * 
				 * Element addText(String text)
				 * 向当前元素中添加指定文本
				 * 
				 * Element addAttribute(String name,String value)
				 * 向当前元素中添加指定名字及对应值的属性
				 */
				Element empEle = root.addElement("emp");
				
				//添加<name>
				Element nameEle = empEle.addElement("name");
				nameEle.addText(emp.getName());
				
				//添加<age>
				Element ageEle = empEle.addElement("age");
				ageEle.addText(String.valueOf(emp.getAge()));
				
				//添加<gender>
				empEle.addElement("gender").addText(
					emp.getGender()
				);
				
				//添加<salary>
				empEle.addElement("salary").addText(
					String.valueOf(emp.getSalary())	
				);
				
				//添加id属性
				empEle.addAttribute(
					"id", String.valueOf(emp.getId())
				);
			}
			
			
			FileOutputStream fos
				= new FileOutputStream("myemp.xml");
			 
			writer = new XMLWriter(
				fos,OutputFormat.createPrettyPrint()
			);
			
			writer.write(document);
			System.out.println("生成完毕!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if(writer != null){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}








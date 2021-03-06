package day08;

import java.io.Serializable;
import java.util.List;

/**
 * 使用该类的实例测试对象流的对象读写操作
 * @author adminitartor
 *
 */
public class Person implements Serializable{
	/**
	 * 当一个类实现了Serializable接口后
	 * 应当定义一个常量:序列化版本号
	 * serialVersionUID
	 * 如果我们没有指定,编译器会根据当前类
	 * 的结构生成一个版本号,但是只要当前类
	 * 发生了改变,那么版本号会随之改变.
	 * 
	 * 版本号影响ObjectInputStream在进行
	 * 对象反序列化时的结果
	 * 当OIS发现要进行反序列化的对象与当前
	 * 类版本已经不一致,那么反序列化直接失败
	 * 若一致,则反序列化成功,如果该对象与
	 * 当前类结构不完全一致时,则启用兼容模式,
	 * 即:能还原的属性依然还原.没有的则忽略.
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * 当一个属性被transient修饰后,那么
	 * 该属性在进行对象序列化时值会被忽略
	 * 将不必要的属性忽略可以达到对象"瘦身"
	 * 的目的
	 */
	private transient List<String> otherInfo;
	
	public Person(){
		
	}

	public Person(String name, int age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	public String toString(){
		return name+","+age+","+gender+","+otherInfo;
	}
}








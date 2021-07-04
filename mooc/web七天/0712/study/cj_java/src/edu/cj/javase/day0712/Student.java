package edu.cj.javase.day0712;

/*
 * 封装:隐藏实现的细节对外提供共有的方法给需要的人去使用。如 病人不需要知道药是怎么做的,但是只要知道吃这个药他的病就可以好
 * 
 * java程序中如何实现封装?
 * 封装的三步骤:
 *    1.将对应的属性用private关键字修饰,即私有化处理
 *    2.为对应的私有属性提供共有的setter/getter方法
 *    3.在对应的方法中可以增加对数据的校验以及逻辑判断处理
 * 
 *    java中的封装一般用于某个实体类对象————和数据库中的某张表关联到
 *    
 *    被private修饰的属性或者方法只能在同一个类中被访问到
 *    
 */
public class Student {
	private int stuId; // 属性 成员变量
	private String stuName;
	private String stuSex;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	/*
	 * 生成共有的setter/getter方法
	 */
	// 方法中的int stuId为局部变量只能在方法中被使用到,出了方法则不能访问到
	/*
	 * public void setStuId(int stuId) {
	 * //为了区分成员变量以及局部变量,java中提供了this关键字，它表示当前类的一个对象，然后通过this去调用成员变量即可 this.stuId
	 * = stuId; }
	 * 
	 * public int getStuId(){ return stuId; //this关键字有时可以省略不写 如 此处 可以写成
	 * this.stuId; }
	 */

}

class Test {
	public static void main(String[] args) {
		Student tom = new Student();

	}
}
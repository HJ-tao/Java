package entity;

import java.io.Serializable;

public class Course implements Serializable {

	//对象的属性
	private Integer courseId;
	private String name;
	private Integer days;
	
	//Bean属性
	//由get和set方法定义的属性
	//将get/set去掉,并将首字母小写而剩下的单词
	public Integer getId() {
		return courseId;
	}
	public void setId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	
}







package edu.cj.javase.day0713.work;

public class Student {
	private int stuId;
	private String stuName;
	private String stuSex;
	private String stuHobby;

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

	public String getStuHobby() {
		return stuHobby;
	}

	public void setStuHobby(String stuHobby) {
		this.stuHobby = stuHobby;
	}

	@Override
	public String toString() {
		return "{stuId=" + stuId + ", stuName=" + stuName + ", stuSex="
				+ stuSex + ", stuHobby=" + stuHobby +"}";
	}

	public Student(int stuId, String stuName, String stuSex, String stuHobby) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuHobby = stuHobby;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}

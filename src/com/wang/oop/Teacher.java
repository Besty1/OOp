package com.wang.oop;


/**
 * 老师类。（getter,setter）
 * 
 * 属性：姓名，性别，专业
 * 
 * 行为：介绍，教学，作业
 * 
 */
public class Teacher {
	
	//属性
	private String name = "";
	private String gender = "";
	private String major = "";
	
	private String course = "";
	private String homework = "";
	
	//行为
	public void intro(){
		String info = "My name:" + name + "\nMy gender:" + gender + "\nMy major:" + major;
		System.out.println(info);
	}
	
	public void teach(){
		System.out.println(name + "：课堂：" + course);
	}
	
	public void homework(){
		System.out.println(name + "：作业：" + homework);
	}

	//getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getHomework() {
		return homework;
	}

	public void setHomework(String homework) {
		this.homework = homework;
	}
	
}














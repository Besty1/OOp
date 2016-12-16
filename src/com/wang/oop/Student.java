package com.wang.oop;


/**
 * 学生类。(类格式)
 * 
 * 静态属性：姓名，年龄。
 * 动态行为：自我介绍，吃饭，睡觉。
 * 
 */
public class Student {
	
	//属性
	protected String name;
	int age;
	
	//行为
	void intro(){
		System.out.println("name:" + name + "\nage:" + age);
	}
	
	void eat(){
		System.out.println(name + "：一天吃10顿饭！");
	}
	
	void sleep(){
		System.out.println(name + "：一天睡20个小时！");
	}
}














package com.wang.oop;

/**
 * 工人类。
 * 属性：姓名，性别，工种。
 * 行为： 工作，休息。
 */

public class Worker1 {
	
	//属性
	private String name = "";
	private String gender = "";
	private String offer = "";
	
	//无参构造
	public Worker1(){
		name = "unkonwn";
		gender = "unkonwn";
		offer = "unkonwn";
	}
	
	//有参构造
	public Worker1(String n) {
		name = n;
		gender = "unkonwn";
		offer = "unkonwn";
	}
	
	public Worker1(String n, String g) {
		name = n;
		gender = g;
		offer = "unkonwn";
	}
	public Worker1(String n, String g, String o) {
		name = n;
		gender = g;
		offer = o;
	}
	
	
	//行为
	public void intro(){
		System.out.println(name + "," + gender + "," + offer);
	}
	
	public void work(){
		System.out.println(name + "：每天工作8小时！");
	}
	
	public void rest(){
		System.out.println(name + "：每天下午6点下班！");
	}
}



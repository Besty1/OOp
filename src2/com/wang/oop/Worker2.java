package com.wang.oop;

/**
 * 工人类。
 * 
 * 研究默认构造。
 * 
 */

public class Worker2 {
	
	//属性
	private String name = "";
	private String gender = "";
	private String offer = "";
	
	/*
	 * (1)如果没有定义构造，编译器会自动加一个默认的构造
	 * (2)如果定义了构造，编译器将不再添加默认构造
	 * 
	 */
	
	
	
	
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



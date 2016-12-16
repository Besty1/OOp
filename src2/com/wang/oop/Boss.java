package com.wang.oop;


/**
 * 老板类。
 * 
 * 属性：姓名，性别。
 * 行为：工作，休息。
 *
 */
public class Boss {
	
	//属性 
	private String name = "";
	private String gender = "";
	
	//构造
	public Boss(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	
	//行为
	
	public void work(){
		System.out.println(this.name + ",工作就是休息");
	}
	
	public void rest(){
		System.out.println(this.name + ",休息就是虚度");
	}

}

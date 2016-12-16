package com.wang.oop;


/**
 * 计算器类。
 * 
 * 属性：品牌。
 * 行为：加，减，乘，除。
 *
 */
public class Calculator {
	
	//属性
	private String brand = "";
	
	//行为
	public int sum(int a, int b){
		return a + b;
	}
	
	public int sub(int a, int b){
		return a - b;
	}
	
	public int mul(int a, int b){
		return a * b;
	}
	
	public int div(int a, int b){
		return a / b;
	}

	//getter、setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}

package com.wang.oop;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
//		s.intro();

//		Teacher t = new Teacher();
//		t.setName("大傻");
//		t.setMajor("Java");
//		t.setHomework("2 hours");
//		t.setGender("female");
//		t.intro();
//		t.homework();
		
		//问题
		int a = 10;
		int b = 5;
		
		//处理问题
		//通过类创建对象
		Calculator c = new Calculator();
		c.setBrand("aaa"); 
		//通过对象调用方法
		System.out.println("sum:"+ c.sum(a, b));
		System.out.println("sub:"+ c.sub(a, b));
		System.out.println("mul:"+ c.mul(a, b));
		System.out.println("div:"+ c.div(a, b));
	}

}











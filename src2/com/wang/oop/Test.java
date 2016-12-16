package com.wang.oop;

public class Test {

	public static void main(String[] args) {
		// 
		Boss b = new Boss("aaa", "male");
//		b.work();
//		b.rest();
		
		Triangle t = new Triangle(3, 4, 5);
		System.out.println("是否三角形：" + t.isTriangle());
		System.out.println("是否直角三角形：" + t.isRightAngled());
		System.out.println("周长：" + t.cir());
		System.out.println("面积：" + t.area());
		
		
	}

}







package com.wang.oop;


/**
 * 三角形类。
 * 属性：三个边。
 * 行为：判断是否三角形，判断是否直角三角形，周长，面积。
 *
 */
public class Triangle {
	
	//属性
	private int a = 0;
	private int b = 0;
	private int c = 0;
	
	//无参构造
	public Triangle(){
		
	}
	
	//有参够造
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//方法
	/**
	 * 是否三角形
	 * 
	 * @return
	 */
	public boolean isTriangle(){
		
		if ((a+b>c) && (a+c>b) && (a+c>a)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * 是否直角三角形
	 * 
	 * @return
	 */
	public boolean isRightAngled(){
		
		if (isTriangle()) {
			if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 周长
	 * 
	 * @return
	 */
	public double cir(){

		return a + b + c;
	}
	
	/**
	 * 面积
	 * 海伦公式：面积=开平方（p*（p-a）*（p-b）*（p-c）），
	 * p为三角形半周长，a，b，c为三边长。
	 * @return
	 */
	public double area(){
		double s = 0;
		
		//是否三角形
		if (!isTriangle()) {
			System.out.println("不是三角形，无法计算面积！");
			return 0;
		}
		
		//计算周长
		double l = cir();
		//半周长
		l = l/2;
		//计算面积
		s = Math.sqrt(l * (l - a) * (l - b) * (l - c));
		
		return s;
	}

	
	//getter setter
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}

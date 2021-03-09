package com.earth.HelloWorld;

public class HelloWorld {
	public static void main(String[] args) {
		int x = 2;
		boolean t = true; 
		String name = "earth";
		double y = 1.5 ;
		float myFloatNum = 5.99f;
		char z = '2';
		
		//เปลี่ยนค่า 
		int myint  = (int) myFloatNum;
		float myfloat = x;
		float myfloatd = (float)y;
		int myintc = z;
		System.out.println(myint);
		System.out.println(myfloat);
		System.out.println(myfloatd);
		System.out.println(myintc);
		
		final String hello = "Hello";
		
		bark();
	}
	
	public static void bark() {
		String dogName = "jonh";
		System.out.println("The Dog name =" + dogName +"bark");
	}
	
}

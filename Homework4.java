package com.earth.HelloWorld;

public class Homework4 {
	public static void main(String[] args) {
		int score = 0;
		boolean isHandSome = true;
		
		if(isHandSome == true) {
			System.out.print("Good");
		}else if(score >= 80) {
			System.out.println("Good");
		}else if((score >=50) && (score <= 80)) {
			System.out.println("normal");
		}else if(score < 50) {
			System.out.println("fail");
		}
	}
}

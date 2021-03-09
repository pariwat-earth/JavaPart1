package com.earth.HelloWorld;

public class Homework4_3 {
	public static void main(String[] args){
		int score = 200;	
		String gpa = "";
		
		switch(score){
		case 80:
			gpa = "A";
		case 70:
			gpa = "B";
		case 60:
			gpa = "C";
		case 50:
			gpa = "D";
		case 40:
			gpa = "F";
		default:
			gpa = "E";
		}
		System.out.println(gpa);
	}
}

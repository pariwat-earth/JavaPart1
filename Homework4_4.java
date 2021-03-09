package com.earth.HelloWorld;

import java.util.Scanner;

public interface Homework4_4 {
	public static void main(String[] args) {
		//Lab6
		//1.	
		/*int i = 1;
			while(i <= 10) {
				System.out.println(i);
				i++;
			}*/
		//2.
		/*int x = 1;
		int sum = 0;
			while(x <= 10) {
				sum += x;
				x++;
			}
			System.out.println(sum);*/
		
		//3
			/*int x = 0;
			while(x <= 100) {
				if((x % 12) == 0 ) {
					System.out.println(x);
				}
				x++;
			}*/
		
		//4
		/*
		int myArray[] = {1,2,3,4,5};
		for(int counter : myArray) {
		System.out.println("Counter :" + counter);
		}
		*/
		
		//Lab7
		//1
		/*int num = 0;
		do {
			System.out.println(num);
			num++;
		}while(num <= 20);*/
		
		//2
		 /*Scanner reader  = new Scanner(System.in);
	        int number;

	        do {
	            System.out.print("Enter odd number to exit loop: ");
	            number = reader.nextInt();

	        } while (number % 2 == 0);

	        System.out.println("Exited loop.");*/
		
		//Lab8
		//1
		/*for (int counter = 0; counter <= 20; counter++) {
			if (counter == 11) {
				System.out.println(counter);
				break;
			}	
			System.out.println("Counter : " + counter);
		}*/	
	}
}

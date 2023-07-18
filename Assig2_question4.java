package com.gurukul.day2.assignment2;

import java.util.Scanner;

public class Assig2_question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter  x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>0 && y>0)
			System.out.println("1st Quadrant");
		else
			if(x>0 && y<0)
				System.out.println("4th Quadrant");
		else
			if(x<0 && y<0)
				System.out.println("3rd Quadrant ");
		else
			if(x<0 && y>0)
				System.out.println("2nd Quadrant");
		else
			if(x==0 && y>0)
				System.out.println("Y axis");
		else
			if(y==0 && x>0)
				System.out.println("x axis");		
		else
		 System.out.println("on 0");
		 
		

	}

}

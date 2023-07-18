package com.gurukul.day2.assignment2;

import java.util.Scanner;

public class Assi2_question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of limit:");
		int no= sc.nextInt();
		double sum=1,fact=1,x;
		System.out.println("Enter value of x:");
		x=sc.nextDouble();
		
	
		
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
			sum =sum + ((Math.pow(x, i))/fact);
			
			
		}
		System.out.println(sum);
		

	}

}

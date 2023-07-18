package com.gurukul.day2.assignment2;

import java.util.Scanner;

public class assi2_question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter degree:");
		
		double s=1,f=1,x,num;
	
		x=sc.nextDouble();
		x = Math.toRadians(x);
		num=-(Math.pow(x, 2));
		
		for(int i=1;i<=20;i++)
		{
			f=f*i;
			if(i%2==0)
			{
				s= s+(num/f);
				num=-num*x*x;
			}		
			}
				
		System.out.println(s);
		//System.out.println(Math.cos(x));

	}

}

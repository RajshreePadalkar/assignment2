package com.gurukul.day2.assignment2;

import java.util.Scanner;

public class assi2_question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0,l=0,s=1,t=1,u;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upper and lower limit:");
		l= sc.nextInt();
		u=sc.nextInt();
		for(int i=1;i<=40;i++)
		{
			if(f>=l && f< u)
			{
				System.out.println(f);
			}
			t=f+s;
			f=s;
			s=t;	
		}
		
		
	}

}

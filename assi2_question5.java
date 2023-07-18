package com.gurukul.day2.assignment2;

public class assi2_question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f=0,s=1,t=0,count=10;
		
		for(int i=1;i<=count;i++)
		{
			if(f%2==0)
			
				System.out.println("Fibonacii:"+f);
			else
				count++;
			t=f+s;
			f=s;
			s=t;
					
		}
	}

}

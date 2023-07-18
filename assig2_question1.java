package com.gurukul.day2.assignment2;

import java.util.Scanner;

public class assig2_question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter r1;");
		double r1=sc.nextDouble();
		System.out.println("Enter r1;");
		double r2=sc.nextDouble();
		System.out.println("Enter t1;");
		double t1=sc.nextDouble();
		System.out.println("Enter t1;");
		double t2=sc.nextDouble();
		
		t1=Math.toRadians(t1);
		t2=Math.toRadians(t2);
		double x1=r1*Math.cos(t1);
		double x2=r2*Math.cos(t2);
		double y1=r1*Math.sin(t1);
		double y2=r2*Math.sin(t2);
		
		double x3=x1+x2;
		double y3=y1+y2;
		
		double r3= Math.sqrt(Math.pow(x3, 2)+Math.pow(y3,2));
		
		double th3= Math.atan2(y3, x3);
		th3=Math.toDegrees(th3);
		
		System.out.println(" r:"+r3+"  th :"+th3);
		
		
		
		
	}

}

package com.basic;
import java.util.Scanner;

public class Sqr {

	public static void main(String[] args) {
		
		int a;
		int b;
		int ans=1;
		Scanner sc=new Scanner  (System.in);
		

		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("First number is : "+ a +"\nSecond number is :"+ b );
		
		for(int i=0 ; i<b ; i--)
		{
			ans*=a;
		}
		System.out.println("ans is "+ ans);

	}

}

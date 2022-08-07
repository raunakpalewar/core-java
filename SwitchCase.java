package com.basic;

import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		
		int a;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the number : "+a);
		
		for(int i=a;i>0;i--)
		{
			fact*=i;
		}
		System.out.println("\nfactorial is" +fact );
	}
}

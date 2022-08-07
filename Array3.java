package com.basic;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		int arr[]=new int[6];
		Scanner s=new Scanner(System.in);
		int i=0,temp=0,flag=0;
		for(i=0;i<6;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the Number You want to Search :");
		temp=s.nextInt();
		
		for(i=0;i<6;i++)
		{
			if(temp==arr[i])
			{
				System.out.println("Element found at"+(i+1)+" position");
				flag=1;
			}
				
		}
		if(flag!=1)
		{
			System.out.println("Element not Found");
		}
		
	}

}

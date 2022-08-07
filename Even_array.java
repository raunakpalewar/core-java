package com.basic;

import java.util.Scanner;

public class Even_array {
	public static void main(String[] args) {
		
		int arr[]=new int [6];
		int i;
		int sum=0;
		Scanner s=new Scanner(System.in);
		
		for(i=0;i<6;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<6;i++)
		{
			if(arr[i]%2==0)
				{	
					System.out.println(arr[i]);
					sum+=arr[i];
				}
			
		}
		System.out.println("sum of all even values is "+ sum);
		
	}

}

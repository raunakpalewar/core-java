package com.basic;

import java.util.Scanner;

public class min_max {
	public static void main(String[] args) {
		int arr[]=new int [10];
		int max=0,min=0;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=9;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int j=0;j<=9;j++)
			System.out.println(arr[j]);

		min=arr[0];
		max=arr[0];
		for(int k=0;k<10;k++)
		{
			if(min>arr[k])
				min=arr[k];
		}
		for(int m=0;m<10;m++)
		{
			if(max<arr[m])
			
			max=arr[m];
			
		}
	System.out.println(min + "is min \n");
	System.out.println(max + "is max \n");
	}

}

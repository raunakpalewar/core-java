package com.basic;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int arr[]=new int [10];
		int sum=0;
		int max,min;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=9;i++)
		{
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		for(int j=0;j<=9;j++)
			System.out.println(arr[j]);
		//int arrrayLength=arr.length;
		System.out.println("/n Length of the array is :"arr.length);
		System.out.println(sum + "is the length");
		for(j=0;j<=10;j++)
		{
			if(arr[j]<=arr[j+1])
			{
				max=arr[j+1];
			}
			else 
				max=arr[j];
		}
		for(j=0;j<=10;j++)
		{
			if(arr[j]<=arr[j+1])
			{
				min=arr[j];
			}
			else 
				min=arr[j+1];
		}
	System.out.println(min);
	System.out.println(max);
	}

}

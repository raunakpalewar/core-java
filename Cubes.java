package com.basic;
import java.util.Scanner;
public class Cubes {

	public static void main(String[] args) {
		
		int arr[]=new int[10];
		int arr2[]=new int[10];
		int i=0;
		Scanner s=new Scanner(System.in);
		
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			arr2[i]=arr[i]*arr[i]*arr[i];
			System.out.println(arr2[i]);
		}	
		
		
	}

}
